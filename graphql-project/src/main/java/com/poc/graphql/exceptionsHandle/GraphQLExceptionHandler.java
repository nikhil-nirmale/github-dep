package com.poc.graphql.exceptionsHandle;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.stereotype.Component;

@Component
public class GraphQLExceptionHandler extends DataFetcherExceptionResolverAdapter {

    @Override
    protected GraphQLError resolveToSingleError(Throwable ex, DataFetchingEnvironment env) {
        if (ex instanceof RuntimeException) {
            return GraphqlErrorBuilder.newError(env)
                    .message(ex.getMessage())
                    .errorType(ErrorType.DataFetchingException)
                    .build();
        }

        // default handler
        return GraphqlErrorBuilder.newError(env)
                .message("Internal server error: " + ex.getMessage())
                .errorType(ErrorType.DataFetchingException)
                .build();
    }
}