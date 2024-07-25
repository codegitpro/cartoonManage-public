package cn.saberking.jvav.apm.common.exception.file;

import cn.saberking.jvav.apm.common.exception.BaseException;

/**
 * 文件信息异常类
 *
 * @author apm
 */
public class FileException extends BaseException {
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args) {
        super("file", code, args, null);
    }

}