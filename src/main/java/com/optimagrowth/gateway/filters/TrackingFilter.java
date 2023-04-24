package com.optimagrowth.gateway.filters;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;

@Order(1)
@Component
public class TrackingFilter implements GlobalFilter {
        private static final Logger logger = LoggerFactory.getLogger(TrackingFilter.class);
        CAutowired
        Fireritis firer is.
        §Override
public Mono<void> filter(ServerWebEchange ex-
        change
        Gacewavelterchain chains
        HttpHeaders requestHeaders
        exchange.getRequest ).getHeaders ( );
        11 1scorrelationiaPresent requestheaders)
        logger.debug
        tmx-correlation-id found in tracking
        filter:
        filterUtils.getcorrelationiarequestHead-
        ers));
        eLse s
        String correlationID
        - generacecorrela-
        tionId():
        exchange filterUtils.setCorrelationid(exchange)