package com.demo;

import org.apache.camel.builder.RouteBuilder;

public class MyRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {


        from("file:C:\\datafiles\\input?noop=true")
                .to("file:C:\\datafiles\\output");
    }

    /*
     public enum FileTransferType {
        COPY_WITHOUT_IMPACTING_ORIGINALS("C"),
        COPY_WITH_ARCHIVED_ORIGINALS("A"),
        MOVE("M");

        private final String letter;

        FileTransferType(final String newLetter) {
            this.letter = newLetter;
        }

        public String getLetter() {
            return this.letter;
        }

        public static FileTransferType fromLetter(final String letter) {
            FileTransferType match = null;
            for (final FileTransferType type : FileTransferType.values()) {
                if (type.getLetter().equalsIgnoreCase(letter)) {
                    match = type;
                    break;
                }
            }
            return match;
        }
    }

    private final String fromEndPointString;
    private final static String FROM_BASE = "file:C:\\datafiles\\input";
    private final static String FROM_NOOP = FROM_BASE + "?noop=true";
    private final static String FROM_MOVE = FROM_BASE + "?delete=true";

    public MyRouteBuilder(final FileTransferType newFileTransferType) {
        if (newFileTransferType != null) {
            switch (newFileTransferType) {
                case COPY_WITHOUT_IMPACTING_ORIGINALS:
                    this.fromEndPointString = FROM_NOOP;
                    break;
                case COPY_WITH_ARCHIVED_ORIGINALS:
                    this.fromEndPointString = FROM_BASE;
                    break;
                case MOVE:
                    this.fromEndPointString = FROM_MOVE;
                    break;
                default:
                    this.fromEndPointString = FROM_NOOP;
            }
        } else {
            fromEndPointString = FROM_NOOP;
        }
    }

    @Override
    public void configure() throws Exception {
        from(this.fromEndPointString).to("file:C:\\datafiles\\output");
    }
     */
}
