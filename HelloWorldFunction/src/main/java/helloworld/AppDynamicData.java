package helloworld;

import com.amazonaws.services.lambda.runtime.Context;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class AppDynamicData {

    public void invokeDataStream(InputStream inputStream,
                                 OutputStream outputStream,
                                 Context awsContext) throws IOException {
        System.out.println("AWS RequestId is :" + awsContext.getAwsRequestId());
        System.out.println("AWS FunctionName is :" + awsContext.getFunctionName());
        System.out.println("Remaining Time inMillis is :" + awsContext.getRemainingTimeInMillis());
        System.out.println("Memory Limit is :" + awsContext.getMemoryLimitInMB());
        System.out.println("AWS Log-GroupName is :" + awsContext.getLogGroupName());
        System.out.println("AWS Log-StreamName is :" + awsContext.getLogStreamName());

        int data;
        while ((data = inputStream.read()) != -1) {
            outputStream.write(Character.toLowerCase(data));
        }
    }
}
