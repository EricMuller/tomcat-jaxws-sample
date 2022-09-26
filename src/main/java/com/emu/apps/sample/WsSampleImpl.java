package com.emu.apps.sample;


import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class WsSampleImpl {

    public String printMessage() {
        return "Hello, World!";
    }

    public Response getMessage() {

        return new Response("code","message");
    }


   public static  class Response {
        String code;

        String message;

       public Response() {
       }

       public Response(String code, String message) {
            this.code = code;
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
