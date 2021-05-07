package co.masg.handsontest.config;

import co.masg.handsontest.domain.exception.ExternalApiConnectionException;
import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

import java.nio.charset.StandardCharsets;

@Slf4j
public class CustomErrorDecoder implements ErrorDecoder {

    @SneakyThrows
    @Override
    public Exception decode(String methodKey, Response response) {
        return  new ExternalApiConnectionException(response.request().toString());
    }

}
