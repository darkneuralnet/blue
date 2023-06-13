package com.amazonaws.services.p026s3.model.transform;

import com.amazonaws.services.p026s3.internal.DeleteObjectsResponse;
import com.amazonaws.services.p026s3.model.AccessControlList;
import com.amazonaws.services.p026s3.model.Bucket;
import com.amazonaws.services.p026s3.model.BucketAccelerateConfiguration;
import com.amazonaws.services.p026s3.model.BucketCrossOriginConfiguration;
import com.amazonaws.services.p026s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.p026s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.p026s3.model.BucketReplicationConfiguration;
import com.amazonaws.services.p026s3.model.BucketTaggingConfiguration;
import com.amazonaws.services.p026s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.p026s3.model.BucketWebsiteConfiguration;
import com.amazonaws.services.p026s3.model.DeleteBucketAnalyticsConfigurationResult;
import com.amazonaws.services.p026s3.model.DeleteBucketInventoryConfigurationResult;
import com.amazonaws.services.p026s3.model.DeleteBucketMetricsConfigurationResult;
import com.amazonaws.services.p026s3.model.DeleteObjectTaggingResult;
import com.amazonaws.services.p026s3.model.GetBucketAnalyticsConfigurationResult;
import com.amazonaws.services.p026s3.model.GetBucketInventoryConfigurationResult;
import com.amazonaws.services.p026s3.model.GetBucketMetricsConfigurationResult;
import com.amazonaws.services.p026s3.model.GetObjectTaggingResult;
import com.amazonaws.services.p026s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.p026s3.model.ListBucketAnalyticsConfigurationsResult;
import com.amazonaws.services.p026s3.model.ListBucketInventoryConfigurationsResult;
import com.amazonaws.services.p026s3.model.ListBucketMetricsConfigurationsResult;
import com.amazonaws.services.p026s3.model.ListObjectsV2Result;
import com.amazonaws.services.p026s3.model.MultipartUploadListing;
import com.amazonaws.services.p026s3.model.ObjectListing;
import com.amazonaws.services.p026s3.model.Owner;
import com.amazonaws.services.p026s3.model.PartListing;
import com.amazonaws.services.p026s3.model.RequestPaymentConfiguration;
import com.amazonaws.services.p026s3.model.SetBucketAnalyticsConfigurationResult;
import com.amazonaws.services.p026s3.model.SetBucketInventoryConfigurationResult;
import com.amazonaws.services.p026s3.model.SetBucketMetricsConfigurationResult;
import com.amazonaws.services.p026s3.model.SetObjectTaggingResult;
import com.amazonaws.services.p026s3.model.VersionListing;
import com.amazonaws.services.p026s3.model.transform.XmlResponsesSaxParser;
import com.amazonaws.transform.Unmarshaller;
import java.io.InputStream;
import java.util.List;
/* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers */
/* loaded from: classes3.dex */
public class Unmarshallers {

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$AccessControlListUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class AccessControlListUnmarshaller implements Unmarshaller<AccessControlList, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public AccessControlList unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseAccessControlListResponse(inputStream).getAccessControlList();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$BucketAccelerateConfigurationUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class BucketAccelerateConfigurationUnmarshaller implements Unmarshaller<BucketAccelerateConfiguration, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public BucketAccelerateConfiguration unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseAccelerateConfigurationResponse(inputStream).getConfiguration();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$BucketCrossOriginConfigurationUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class BucketCrossOriginConfigurationUnmarshaller implements Unmarshaller<BucketCrossOriginConfiguration, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public BucketCrossOriginConfiguration unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseBucketCrossOriginConfigurationResponse(inputStream).getConfiguration();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$BucketLifecycleConfigurationUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class BucketLifecycleConfigurationUnmarshaller implements Unmarshaller<BucketLifecycleConfiguration, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public BucketLifecycleConfiguration unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseBucketLifecycleConfigurationResponse(inputStream).getConfiguration();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$BucketLocationUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class BucketLocationUnmarshaller implements Unmarshaller<String, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public String unmarshall(InputStream inputStream) throws Exception {
            String parseBucketLocationResponse = new XmlResponsesSaxParser().parseBucketLocationResponse(inputStream);
            return parseBucketLocationResponse == null ? "US" : parseBucketLocationResponse;
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$BucketLoggingConfigurationnmarshaller */
    /* loaded from: classes3.dex */
    public static final class BucketLoggingConfigurationnmarshaller implements Unmarshaller<BucketLoggingConfiguration, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public BucketLoggingConfiguration unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseLoggingStatusResponse(inputStream).getBucketLoggingConfiguration();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$BucketReplicationConfigurationUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class BucketReplicationConfigurationUnmarshaller implements Unmarshaller<BucketReplicationConfiguration, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public BucketReplicationConfiguration unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseReplicationConfigurationResponse(inputStream).getConfiguration();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$BucketTaggingConfigurationUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class BucketTaggingConfigurationUnmarshaller implements Unmarshaller<BucketTaggingConfiguration, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public BucketTaggingConfiguration unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseTaggingConfigurationResponse(inputStream).getConfiguration();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$BucketVersioningConfigurationUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class BucketVersioningConfigurationUnmarshaller implements Unmarshaller<BucketVersioningConfiguration, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public BucketVersioningConfiguration unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseVersioningConfigurationResponse(inputStream).getConfiguration();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$BucketWebsiteConfigurationUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class BucketWebsiteConfigurationUnmarshaller implements Unmarshaller<BucketWebsiteConfiguration, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public BucketWebsiteConfiguration unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseWebsiteConfigurationResponse(inputStream).getConfiguration();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$CompleteMultipartUploadResultUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class CompleteMultipartUploadResultUnmarshaller implements Unmarshaller<XmlResponsesSaxParser.CompleteMultipartUploadHandler, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public XmlResponsesSaxParser.CompleteMultipartUploadHandler unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseCompleteMultipartUploadResponse(inputStream);
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$CopyObjectUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class CopyObjectUnmarshaller implements Unmarshaller<XmlResponsesSaxParser.CopyObjectResultHandler, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public XmlResponsesSaxParser.CopyObjectResultHandler unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseCopyObjectResponse(inputStream);
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$DeleteBucketAnalyticsConfigurationUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class DeleteBucketAnalyticsConfigurationUnmarshaller implements Unmarshaller<DeleteBucketAnalyticsConfigurationResult, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public DeleteBucketAnalyticsConfigurationResult unmarshall(InputStream inputStream) throws Exception {
            return new DeleteBucketAnalyticsConfigurationResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$DeleteBucketInventoryConfigurationUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class DeleteBucketInventoryConfigurationUnmarshaller implements Unmarshaller<DeleteBucketInventoryConfigurationResult, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public DeleteBucketInventoryConfigurationResult unmarshall(InputStream inputStream) throws Exception {
            return new DeleteBucketInventoryConfigurationResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$DeleteBucketMetricsConfigurationUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class DeleteBucketMetricsConfigurationUnmarshaller implements Unmarshaller<DeleteBucketMetricsConfigurationResult, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public DeleteBucketMetricsConfigurationResult unmarshall(InputStream inputStream) throws Exception {
            return new DeleteBucketMetricsConfigurationResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$DeleteObjectTaggingResponseUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class DeleteObjectTaggingResponseUnmarshaller implements Unmarshaller<DeleteObjectTaggingResult, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public DeleteObjectTaggingResult unmarshall(InputStream inputStream) throws Exception {
            return new DeleteObjectTaggingResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$DeleteObjectsResultUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class DeleteObjectsResultUnmarshaller implements Unmarshaller<DeleteObjectsResponse, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public DeleteObjectsResponse unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseDeletedObjectsResult(inputStream).getDeleteObjectResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$GetBucketAnalyticsConfigurationUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class GetBucketAnalyticsConfigurationUnmarshaller implements Unmarshaller<GetBucketAnalyticsConfigurationResult, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public GetBucketAnalyticsConfigurationResult unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseGetBucketAnalyticsConfigurationResponse(inputStream).getResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$GetBucketInventoryConfigurationUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class GetBucketInventoryConfigurationUnmarshaller implements Unmarshaller<GetBucketInventoryConfigurationResult, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public GetBucketInventoryConfigurationResult unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseGetBucketInventoryConfigurationResponse(inputStream).getResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$GetBucketMetricsConfigurationUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class GetBucketMetricsConfigurationUnmarshaller implements Unmarshaller<GetBucketMetricsConfigurationResult, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public GetBucketMetricsConfigurationResult unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseGetBucketMetricsConfigurationResponse(inputStream).getResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$GetObjectTaggingResponseUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class GetObjectTaggingResponseUnmarshaller implements Unmarshaller<GetObjectTaggingResult, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public GetObjectTaggingResult unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseObjectTaggingResponse(inputStream).getResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$InitiateMultipartUploadResultUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class InitiateMultipartUploadResultUnmarshaller implements Unmarshaller<InitiateMultipartUploadResult, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public InitiateMultipartUploadResult unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseInitiateMultipartUploadResponse(inputStream).getInitiateMultipartUploadResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$InputStreamUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class InputStreamUnmarshaller implements Unmarshaller<InputStream, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public InputStream unmarshall(InputStream inputStream) throws Exception {
            return inputStream;
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$ListBucketAnalyticsConfigurationUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class ListBucketAnalyticsConfigurationUnmarshaller implements Unmarshaller<ListBucketAnalyticsConfigurationsResult, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public ListBucketAnalyticsConfigurationsResult unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseListBucketAnalyticsConfigurationResponse(inputStream).getResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$ListBucketInventoryConfigurationsUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class ListBucketInventoryConfigurationsUnmarshaller implements Unmarshaller<ListBucketInventoryConfigurationsResult, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public ListBucketInventoryConfigurationsResult unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseBucketListInventoryConfigurationsResponse(inputStream).getResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$ListBucketMetricsConfigurationsUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class ListBucketMetricsConfigurationsUnmarshaller implements Unmarshaller<ListBucketMetricsConfigurationsResult, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public ListBucketMetricsConfigurationsResult unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseListBucketMetricsConfigurationsResponse(inputStream).getResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$ListBucketsOwnerUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class ListBucketsOwnerUnmarshaller implements Unmarshaller<Owner, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public Owner unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseListMyBucketsResponse(inputStream).getOwner();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$ListBucketsUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class ListBucketsUnmarshaller implements Unmarshaller<List<Bucket>, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public List<Bucket> unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseListMyBucketsResponse(inputStream).getBuckets();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$ListMultipartUploadsResultUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class ListMultipartUploadsResultUnmarshaller implements Unmarshaller<MultipartUploadListing, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public MultipartUploadListing unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseListMultipartUploadsResponse(inputStream).getListMultipartUploadsResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$ListObjectsUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class ListObjectsUnmarshaller implements Unmarshaller<ObjectListing, InputStream> {
        private final boolean shouldSDKDecodeResponse;

        public ListObjectsUnmarshaller(boolean z) {
            this.shouldSDKDecodeResponse = z;
        }

        @Override // com.amazonaws.transform.Unmarshaller
        public ObjectListing unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseListBucketObjectsResponse(inputStream, this.shouldSDKDecodeResponse).getObjectListing();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$ListObjectsV2Unmarshaller */
    /* loaded from: classes3.dex */
    public static final class ListObjectsV2Unmarshaller implements Unmarshaller<ListObjectsV2Result, InputStream> {
        private final boolean shouldSDKDecodeResponse;

        public ListObjectsV2Unmarshaller(boolean z) {
            this.shouldSDKDecodeResponse = z;
        }

        @Override // com.amazonaws.transform.Unmarshaller
        public ListObjectsV2Result unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseListObjectsV2Response(inputStream, this.shouldSDKDecodeResponse).getResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$ListPartsResultUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class ListPartsResultUnmarshaller implements Unmarshaller<PartListing, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public PartListing unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseListPartsResponse(inputStream).getListPartsResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$RequestPaymentConfigurationUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class RequestPaymentConfigurationUnmarshaller implements Unmarshaller<RequestPaymentConfiguration, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public RequestPaymentConfiguration unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseRequestPaymentConfigurationResponse(inputStream).getConfiguration();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$SetBucketAnalyticsConfigurationUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class SetBucketAnalyticsConfigurationUnmarshaller implements Unmarshaller<SetBucketAnalyticsConfigurationResult, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public SetBucketAnalyticsConfigurationResult unmarshall(InputStream inputStream) throws Exception {
            return new SetBucketAnalyticsConfigurationResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$SetBucketInventoryConfigurationUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class SetBucketInventoryConfigurationUnmarshaller implements Unmarshaller<SetBucketInventoryConfigurationResult, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public SetBucketInventoryConfigurationResult unmarshall(InputStream inputStream) throws Exception {
            return new SetBucketInventoryConfigurationResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$SetBucketMetricsConfigurationUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class SetBucketMetricsConfigurationUnmarshaller implements Unmarshaller<SetBucketMetricsConfigurationResult, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public SetBucketMetricsConfigurationResult unmarshall(InputStream inputStream) throws Exception {
            return new SetBucketMetricsConfigurationResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$SetObjectTaggingResponseUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class SetObjectTaggingResponseUnmarshaller implements Unmarshaller<SetObjectTaggingResult, InputStream> {
        @Override // com.amazonaws.transform.Unmarshaller
        public SetObjectTaggingResult unmarshall(InputStream inputStream) throws Exception {
            return new SetObjectTaggingResult();
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.transform.Unmarshallers$VersionListUnmarshaller */
    /* loaded from: classes3.dex */
    public static final class VersionListUnmarshaller implements Unmarshaller<VersionListing, InputStream> {
        private final boolean shouldSDKDecodeResponse;

        public VersionListUnmarshaller(boolean z) {
            this.shouldSDKDecodeResponse = z;
        }

        @Override // com.amazonaws.transform.Unmarshaller
        public VersionListing unmarshall(InputStream inputStream) throws Exception {
            return new XmlResponsesSaxParser().parseListVersionsResponse(inputStream, this.shouldSDKDecodeResponse).getListing();
        }
    }
}
