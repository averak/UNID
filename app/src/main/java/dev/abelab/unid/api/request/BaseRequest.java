package dev.abelab.unid.api.request;

import dev.abelab.unid.exception.BaseException;

/**
 * Bese Request
 */
public interface BaseRequest {

    /**
     * リクエストボディのバリデーション
     */
    void validate() throws BaseException;

}
