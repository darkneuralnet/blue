.class Lcom/amazonaws/regions/RegionDefaults;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getRegions()Ljava/util/List;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/amazonaws/regions/Region;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v2, "ap-northeast-1"

    const-string v3, "amazonaws.com"

    invoke-direct {v1, v2, v3}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v2, "autoscaling"

    const-string v4, "autoscaling.ap-northeast-1.amazonaws.com"

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v1, v2, v4, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v4, "cognito-identity.ap-northeast-1.amazonaws.com"

    const-string v7, "cognito-identity"

    invoke-static {v1, v7, v4, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v4, "cognito-idp.ap-northeast-1.amazonaws.com"

    const-string v8, "cognito-idp"

    invoke-static {v1, v8, v4, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v4, "cognito-sync.ap-northeast-1.amazonaws.com"

    const-string v9, "cognito-sync"

    invoke-static {v1, v9, v4, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v4, "data.iot.ap-northeast-1.amazonaws.com"

    const-string v10, "data.iot"

    invoke-static {v1, v10, v4, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v4, "dynamodb.ap-northeast-1.amazonaws.com"

    const-string v11, "dynamodb"

    invoke-static {v1, v11, v4, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v4, "ec2.ap-northeast-1.amazonaws.com"

    const-string v12, "ec2"

    invoke-static {v1, v12, v4, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v4, "elasticloadbalancing.ap-northeast-1.amazonaws.com"

    const-string v13, "elasticloadbalancing"

    invoke-static {v1, v13, v4, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v4, "firehose"

    const-string v14, "firehose.ap-northeast-1.amazonaws.com"

    invoke-static {v1, v4, v14, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v4, "iot.ap-northeast-1.amazonaws.com"

    const-string v14, "iot"

    invoke-static {v1, v14, v4, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v4, "kinesis.ap-northeast-1.amazonaws.com"

    const-string v15, "kinesis"

    invoke-static {v1, v15, v4, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v4, "kms.ap-northeast-1.amazonaws.com"

    move-object/from16 v16, v15

    const-string v15, "kms"

    invoke-static {v1, v15, v4, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v4, "lambda.ap-northeast-1.amazonaws.com"

    move-object/from16 v17, v15

    const-string v15, "lambda"

    invoke-static {v1, v15, v4, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v4, "logs.ap-northeast-1.amazonaws.com"

    move-object/from16 v18, v15

    const-string v15, "logs"

    invoke-static {v1, v15, v4, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v4, "polly.ap-northeast-1.amazonaws.com"

    move-object/from16 v19, v15

    const-string v15, "polly"

    invoke-static {v1, v15, v4, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v4, "s3.ap-northeast-1.amazonaws.com"

    move-object/from16 v20, v15

    const-string v15, "s3"

    invoke-static {v1, v15, v4, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v4, "sdb"

    move-object/from16 v21, v15

    const-string v15, "sdb.ap-northeast-1.amazonaws.com"

    invoke-static {v1, v4, v15, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v4, "sns.ap-northeast-1.amazonaws.com"

    const-string v15, "sns"

    invoke-static {v1, v15, v4, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v4, "sqs.ap-northeast-1.amazonaws.com"

    move-object/from16 v22, v15

    const-string v15, "sqs"

    invoke-static {v1, v15, v4, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v4, "sts"

    move-object/from16 v23, v15

    const-string v15, "sts.amazonaws.com"

    invoke-static {v1, v4, v15, v5, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v5, "ap-northeast-2"

    invoke-direct {v1, v5, v3}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v5, "autoscaling.ap-northeast-2.amazonaws.com"

    move-object/from16 v25, v15

    const/4 v15, 0x0

    invoke-static {v1, v2, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "cognito-identity.ap-northeast-2.amazonaws.com"

    invoke-static {v1, v7, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "cognito-idp.ap-northeast-2.amazonaws.com"

    invoke-static {v1, v8, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "cognito-sync.ap-northeast-2.amazonaws.com"

    invoke-static {v1, v9, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "data.iot.ap-northeast-2.amazonaws.com"

    invoke-static {v1, v10, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "dynamodb.ap-northeast-2.amazonaws.com"

    invoke-static {v1, v11, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "ec2.ap-northeast-2.amazonaws.com"

    invoke-static {v1, v12, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "elasticloadbalancing.ap-northeast-2.amazonaws.com"

    invoke-static {v1, v13, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "iot.ap-northeast-2.amazonaws.com"

    invoke-static {v1, v14, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "kinesis.ap-northeast-2.amazonaws.com"

    move-object/from16 v24, v14

    move-object/from16 v14, v16

    invoke-static {v1, v14, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "kms.ap-northeast-2.amazonaws.com"

    move-object/from16 v16, v10

    move-object/from16 v10, v17

    invoke-static {v1, v10, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "lambda.ap-northeast-2.amazonaws.com"

    move-object/from16 v10, v18

    invoke-static {v1, v10, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "logs.ap-northeast-2.amazonaws.com"

    move-object/from16 v10, v19

    invoke-static {v1, v10, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "polly.ap-northeast-2.amazonaws.com"

    move-object/from16 v10, v20

    invoke-static {v1, v10, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "s3.ap-northeast-2.amazonaws.com"

    move-object/from16 v10, v21

    invoke-static {v1, v10, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "sns.ap-northeast-2.amazonaws.com"

    move-object/from16 v10, v22

    invoke-static {v1, v10, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "sqs.ap-northeast-2.amazonaws.com"

    move-object/from16 v10, v23

    invoke-static {v1, v10, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "sts.ap-northeast-2.amazonaws.com"

    invoke-static {v1, v4, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v5, "ap-south-1"

    invoke-direct {v1, v5, v3}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v5, "autoscaling.ap-south-1.amazonaws.com"

    invoke-static {v1, v2, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "cognito-identity.ap-south-1.amazonaws.com"

    invoke-static {v1, v7, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "cognito-idp.ap-south-1.amazonaws.com"

    invoke-static {v1, v8, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "cognito-sync.ap-south-1.amazonaws.com"

    invoke-static {v1, v9, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "dynamodb.ap-south-1.amazonaws.com"

    invoke-static {v1, v11, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "ec2.ap-south-1.amazonaws.com"

    invoke-static {v1, v12, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "elasticloadbalancing.ap-south-1.amazonaws.com"

    invoke-static {v1, v13, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "kinesis.ap-south-1.amazonaws.com"

    invoke-static {v1, v14, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "kms.ap-south-1.amazonaws.com"

    move-object/from16 v23, v14

    move-object/from16 v14, v17

    invoke-static {v1, v14, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "lambda.ap-south-1.amazonaws.com"

    move-object/from16 v14, v18

    invoke-static {v1, v14, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "logs.ap-south-1.amazonaws.com"

    move-object/from16 v14, v19

    invoke-static {v1, v14, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "polly.ap-south-1.amazonaws.com"

    move-object/from16 v14, v20

    invoke-static {v1, v14, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "s3.ap-south-1.amazonaws.com"

    move-object/from16 v14, v21

    invoke-static {v1, v14, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "sns.ap-south-1.amazonaws.com"

    move-object/from16 v14, v22

    invoke-static {v1, v14, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "sqs.ap-south-1.amazonaws.com"

    invoke-static {v1, v10, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    move-object/from16 v5, v25

    invoke-static {v1, v4, v5, v15, v6}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v6, "ap-southeast-1"

    invoke-direct {v1, v6, v3}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v6, "autoscaling.ap-southeast-1.amazonaws.com"

    move-object/from16 v25, v0

    const/4 v0, 0x1

    invoke-static {v1, v2, v6, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "cognito-identity.ap-southeast-1.amazonaws.com"

    invoke-static {v1, v7, v6, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "cognito-idp.ap-southeast-1.amazonaws.com"

    invoke-static {v1, v8, v6, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "cognito-sync.ap-southeast-1.amazonaws.com"

    invoke-static {v1, v9, v6, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "data.iot.ap-southeast-1.amazonaws.com"

    move-object/from16 v22, v9

    move-object/from16 v9, v16

    invoke-static {v1, v9, v6, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "dynamodb.ap-southeast-1.amazonaws.com"

    invoke-static {v1, v11, v6, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "ec2.ap-southeast-1.amazonaws.com"

    invoke-static {v1, v12, v6, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "elasticloadbalancing.ap-southeast-1.amazonaws.com"

    invoke-static {v1, v13, v6, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "iot.ap-southeast-1.amazonaws.com"

    move-object/from16 v16, v13

    move-object/from16 v13, v24

    invoke-static {v1, v13, v6, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "kinesis.ap-southeast-1.amazonaws.com"

    move-object/from16 v13, v23

    invoke-static {v1, v13, v6, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "kms.ap-southeast-1.amazonaws.com"

    move-object/from16 v13, v17

    invoke-static {v1, v13, v6, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "lambda.ap-southeast-1.amazonaws.com"

    move-object/from16 v13, v18

    invoke-static {v1, v13, v6, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "logs.ap-southeast-1.amazonaws.com"

    move-object/from16 v13, v19

    invoke-static {v1, v13, v6, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "polly.ap-southeast-1.amazonaws.com"

    move-object/from16 v13, v20

    invoke-static {v1, v13, v6, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "s3.ap-southeast-1.amazonaws.com"

    move-object/from16 v13, v21

    invoke-static {v1, v13, v6, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "sdb"

    const-string v13, "sdb.ap-southeast-1.amazonaws.com"

    invoke-static {v1, v6, v13, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "sns.ap-southeast-1.amazonaws.com"

    invoke-static {v1, v14, v6, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "sqs.ap-southeast-1.amazonaws.com"

    invoke-static {v1, v10, v6, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-static {v1, v4, v5, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v6, "ap-southeast-2"

    invoke-direct {v1, v6, v3}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v6, v25

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v13, "autoscaling.ap-southeast-2.amazonaws.com"

    invoke-static {v1, v2, v13, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v13, "cognito-identity.ap-southeast-2.amazonaws.com"

    invoke-static {v1, v7, v13, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v13, "cognito-idp.ap-southeast-2.amazonaws.com"

    invoke-static {v1, v8, v13, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v13, "cognito-sync.ap-southeast-2.amazonaws.com"

    move-object/from16 v25, v8

    move-object/from16 v8, v22

    invoke-static {v1, v8, v13, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v13, "data.iot.ap-southeast-2.amazonaws.com"

    invoke-static {v1, v9, v13, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v13, "dynamodb.ap-southeast-2.amazonaws.com"

    invoke-static {v1, v11, v13, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v13, "ec2.ap-southeast-2.amazonaws.com"

    invoke-static {v1, v12, v13, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v13, "elasticloadbalancing.ap-southeast-2.amazonaws.com"

    move-object/from16 v22, v9

    move-object/from16 v9, v16

    invoke-static {v1, v9, v13, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v13, "iot.ap-southeast-2.amazonaws.com"

    move-object/from16 v16, v8

    move-object/from16 v8, v24

    invoke-static {v1, v8, v13, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v13, "kinesis.ap-southeast-2.amazonaws.com"

    move-object/from16 v8, v23

    invoke-static {v1, v8, v13, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v13, "kms.ap-southeast-2.amazonaws.com"

    move-object/from16 v23, v7

    move-object/from16 v7, v17

    invoke-static {v1, v7, v13, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v13, "lambda.ap-southeast-2.amazonaws.com"

    move-object/from16 v7, v18

    invoke-static {v1, v7, v13, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v13, "logs.ap-southeast-2.amazonaws.com"

    move-object/from16 v7, v19

    invoke-static {v1, v7, v13, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v13, "polly.ap-southeast-2.amazonaws.com"

    move-object/from16 v7, v20

    invoke-static {v1, v7, v13, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v13, "s3.ap-southeast-2.amazonaws.com"

    move-object/from16 v7, v21

    invoke-static {v1, v7, v13, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v13, "sdb"

    const-string v7, "sdb.ap-southeast-2.amazonaws.com"

    invoke-static {v1, v13, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "sns.ap-southeast-2.amazonaws.com"

    invoke-static {v1, v14, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "sqs.ap-southeast-2.amazonaws.com"

    invoke-static {v1, v10, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-static {v1, v4, v5, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "ca-central-1"

    invoke-direct {v1, v7, v3}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.ca-central-1.amazonaws.com"

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "dynamodb.ca-central-1.amazonaws.com"

    invoke-static {v1, v11, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "ec2.ca-central-1.amazonaws.com"

    invoke-static {v1, v12, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "elasticloadbalancing.ca-central-1.amazonaws.com"

    invoke-static {v1, v9, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "kinesis.ca-central-1.amazonaws.com"

    invoke-static {v1, v8, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "kms.ca-central-1.amazonaws.com"

    move-object/from16 v13, v17

    invoke-static {v1, v13, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "lambda.ca-central-1.amazonaws.com"

    move-object/from16 v13, v18

    invoke-static {v1, v13, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "logs.ca-central-1.amazonaws.com"

    move-object/from16 v13, v19

    invoke-static {v1, v13, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "polly.ca-central-1.amazonaws.com"

    move-object/from16 v13, v20

    invoke-static {v1, v13, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "s3.ca-central-1.amazonaws.com"

    move-object/from16 v13, v21

    invoke-static {v1, v13, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "sns.ca-central-1.amazonaws.com"

    invoke-static {v1, v14, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "sqs.ca-central-1.amazonaws.com"

    invoke-static {v1, v10, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-static {v1, v4, v5, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "eu-central-1"

    invoke-direct {v1, v7, v3}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.eu-central-1.amazonaws.com"

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "cognito-identity.eu-central-1.amazonaws.com"

    move-object/from16 v21, v2

    move-object/from16 v2, v23

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "cognito-idp.eu-central-1.amazonaws.com"

    move-object/from16 v2, v25

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "cognito-sync.eu-central-1.amazonaws.com"

    move-object/from16 v2, v16

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "data.iot.eu-central-1.amazonaws.com"

    move-object/from16 v2, v22

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "dynamodb.eu-central-1.amazonaws.com"

    invoke-static {v1, v11, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "ec2.eu-central-1.amazonaws.com"

    invoke-static {v1, v12, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "elasticloadbalancing.eu-central-1.amazonaws.com"

    invoke-static {v1, v9, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "firehose"

    move-object/from16 v22, v9

    const-string v9, "firehose.eu-central-1.amazonaws.com"

    invoke-static {v1, v7, v9, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "iot.eu-central-1.amazonaws.com"

    move-object/from16 v9, v24

    invoke-static {v1, v9, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "kinesis.eu-central-1.amazonaws.com"

    invoke-static {v1, v8, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "kms.eu-central-1.amazonaws.com"

    move-object/from16 v24, v8

    move-object/from16 v8, v17

    invoke-static {v1, v8, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "lambda.eu-central-1.amazonaws.com"

    move-object/from16 v8, v18

    invoke-static {v1, v8, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "logs.eu-central-1.amazonaws.com"

    move-object/from16 v8, v19

    invoke-static {v1, v8, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "polly.eu-central-1.amazonaws.com"

    move-object/from16 v8, v20

    invoke-static {v1, v8, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "s3.eu-central-1.amazonaws.com"

    invoke-static {v1, v13, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "sns.eu-central-1.amazonaws.com"

    invoke-static {v1, v14, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "sqs.eu-central-1.amazonaws.com"

    invoke-static {v1, v10, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-static {v1, v4, v5, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "eu-west-1"

    invoke-direct {v1, v7, v3}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.eu-west-1.amazonaws.com"

    move-object/from16 v20, v6

    move-object/from16 v6, v21

    invoke-static {v1, v6, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "cognito-identity.eu-west-1.amazonaws.com"

    move-object/from16 v6, v23

    invoke-static {v1, v6, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "cognito-idp.eu-west-1.amazonaws.com"

    move-object/from16 v6, v25

    invoke-static {v1, v6, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "cognito-sync.eu-west-1.amazonaws.com"

    move-object/from16 v6, v16

    invoke-static {v1, v6, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "data.iot.eu-west-1.amazonaws.com"

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "dynamodb.eu-west-1.amazonaws.com"

    invoke-static {v1, v11, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "ec2.eu-west-1.amazonaws.com"

    invoke-static {v1, v12, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "elasticloadbalancing.eu-west-1.amazonaws.com"

    move-object/from16 v16, v2

    move-object/from16 v2, v22

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "email"

    const-string v2, "email.eu-west-1.amazonaws.com"

    invoke-static {v1, v7, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "firehose"

    const-string v7, "firehose.eu-west-1.amazonaws.com"

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "iot.eu-west-1.amazonaws.com"

    invoke-static {v1, v9, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "kinesis.eu-west-1.amazonaws.com"

    move-object/from16 v7, v24

    invoke-static {v1, v7, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "kms.eu-west-1.amazonaws.com"

    move-object/from16 v7, v17

    invoke-static {v1, v7, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "lambda.eu-west-1.amazonaws.com"

    move-object/from16 v7, v18

    invoke-static {v1, v7, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "logs.eu-west-1.amazonaws.com"

    move-object/from16 v7, v19

    invoke-static {v1, v7, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "machinelearning"

    const-string v7, "machinelearning.eu-west-1.amazonaws.com"

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "polly.eu-west-1.amazonaws.com"

    invoke-static {v1, v8, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "rekognition"

    const-string v7, "rekognition.eu-west-1.amazonaws.com"

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "s3.eu-west-1.amazonaws.com"

    invoke-static {v1, v13, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "sdb"

    const-string v7, "sdb.eu-west-1.amazonaws.com"

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "sns.eu-west-1.amazonaws.com"

    invoke-static {v1, v14, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "sqs.eu-west-1.amazonaws.com"

    invoke-static {v1, v10, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-static {v1, v4, v5, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v2, "eu-west-2"

    invoke-direct {v1, v2, v3}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v2, v20

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.eu-west-2.amazonaws.com"

    move-object/from16 v2, v21

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "cognito-identity.eu-west-2.amazonaws.com"

    move-object/from16 v2, v23

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "cognito-idp.eu-west-2.amazonaws.com"

    move-object/from16 v2, v25

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "cognito-sync.eu-west-2.amazonaws.com"

    invoke-static {v1, v6, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "dynamodb.eu-west-2.amazonaws.com"

    invoke-static {v1, v11, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "ec2.eu-west-2.amazonaws.com"

    invoke-static {v1, v12, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "elasticloadbalancing.eu-west-2.amazonaws.com"

    move-object/from16 v25, v6

    move-object/from16 v6, v22

    invoke-static {v1, v6, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "iot.eu-west-2.amazonaws.com"

    invoke-static {v1, v9, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "kinesis.eu-west-2.amazonaws.com"

    move-object/from16 v22, v9

    move-object/from16 v9, v24

    invoke-static {v1, v9, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "kms.eu-west-2.amazonaws.com"

    move-object/from16 v24, v2

    move-object/from16 v2, v17

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "lambda.eu-west-2.amazonaws.com"

    move-object/from16 v2, v18

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "logs.eu-west-2.amazonaws.com"

    move-object/from16 v2, v19

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "polly.eu-west-2.amazonaws.com"

    invoke-static {v1, v8, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "s3.eu-west-2.amazonaws.com"

    invoke-static {v1, v13, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "sns.eu-west-2.amazonaws.com"

    invoke-static {v1, v14, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "sqs.eu-west-2.amazonaws.com"

    invoke-static {v1, v10, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-static {v1, v4, v5, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "eu-west-3"

    invoke-direct {v1, v7, v3}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v7, v20

    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.eu-west-3.amazonaws.com"

    move-object/from16 v19, v3

    move-object/from16 v3, v21

    invoke-static {v1, v3, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "dynamodb.eu-west-3.amazonaws.com"

    invoke-static {v1, v11, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "ec2.eu-west-3.amazonaws.com"

    invoke-static {v1, v12, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "elasticloadbalancing.eu-west-3.amazonaws.com"

    invoke-static {v1, v6, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "kinesis.eu-west-3.amazonaws.com"

    invoke-static {v1, v9, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "kms.eu-west-3.amazonaws.com"

    move-object/from16 v21, v9

    move-object/from16 v9, v17

    invoke-static {v1, v9, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "lambda.eu-west-3.amazonaws.com"

    move-object/from16 v9, v18

    invoke-static {v1, v9, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "logs.eu-west-3.amazonaws.com"

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "polly.eu-west-3.amazonaws.com"

    invoke-static {v1, v8, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "s3.eu-west-3.amazonaws.com"

    invoke-static {v1, v13, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "sns.eu-west-3.amazonaws.com"

    invoke-static {v1, v14, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "sqs.eu-west-3.amazonaws.com"

    invoke-static {v1, v10, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-static {v1, v4, v5, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "sa-east-1"

    move-object/from16 v0, v19

    invoke-direct {v1, v7, v0}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v7, v20

    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.sa-east-1.amazonaws.com"

    const/4 v0, 0x1

    invoke-static {v1, v3, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "dynamodb.sa-east-1.amazonaws.com"

    invoke-static {v1, v11, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "ec2.sa-east-1.amazonaws.com"

    invoke-static {v1, v12, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "elasticloadbalancing.sa-east-1.amazonaws.com"

    invoke-static {v1, v6, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "kinesis.sa-east-1.amazonaws.com"

    move-object/from16 v18, v6

    move-object/from16 v6, v21

    invoke-static {v1, v6, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "kms.sa-east-1.amazonaws.com"

    move-object/from16 v6, v17

    invoke-static {v1, v6, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "lambda.sa-east-1.amazonaws.com"

    invoke-static {v1, v9, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "logs.sa-east-1.amazonaws.com"

    invoke-static {v1, v2, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "polly.sa-east-1.amazonaws.com"

    invoke-static {v1, v8, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "s3.sa-east-1.amazonaws.com"

    invoke-static {v1, v13, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "sdb"

    move-object/from16 v17, v13

    const-string v13, "sdb.sa-east-1.amazonaws.com"

    invoke-static {v1, v7, v13, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "sns.sa-east-1.amazonaws.com"

    invoke-static {v1, v14, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "sqs.sa-east-1.amazonaws.com"

    invoke-static {v1, v10, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-static {v1, v4, v5, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "us-east-1"

    move-object/from16 v13, v19

    invoke-direct {v1, v7, v13}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v7, v20

    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.us-east-1.amazonaws.com"

    invoke-static {v1, v3, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "cognito-identity.us-east-1.amazonaws.com"

    move-object/from16 v19, v3

    move-object/from16 v3, v23

    invoke-static {v1, v3, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "cognito-idp.us-east-1.amazonaws.com"

    move-object/from16 v3, v24

    invoke-static {v1, v3, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "cognito-sync.us-east-1.amazonaws.com"

    move-object/from16 v3, v25

    invoke-static {v1, v3, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "data.iot.us-east-1.amazonaws.com"

    move-object/from16 v3, v16

    invoke-static {v1, v3, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "dynamodb.us-east-1.amazonaws.com"

    invoke-static {v1, v11, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "ec2.us-east-1.amazonaws.com"

    invoke-static {v1, v12, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "elasticloadbalancing.us-east-1.amazonaws.com"

    move-object/from16 v3, v18

    invoke-static {v1, v3, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v7, "email"

    const-string v3, "email.us-east-1.amazonaws.com"

    invoke-static {v1, v7, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "firehose"

    const-string v7, "firehose.us-east-1.amazonaws.com"

    invoke-static {v1, v3, v7, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "iot.us-east-1.amazonaws.com"

    move-object/from16 v7, v22

    invoke-static {v1, v7, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "kinesis.us-east-1.amazonaws.com"

    move-object/from16 v7, v21

    invoke-static {v1, v7, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "kms.us-east-1.amazonaws.com"

    invoke-static {v1, v6, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "lambda.us-east-1.amazonaws.com"

    invoke-static {v1, v9, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "logs.us-east-1.amazonaws.com"

    invoke-static {v1, v2, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "machinelearning"

    move-object/from16 v21, v2

    const-string v2, "machinelearning.us-east-1.amazonaws.com"

    invoke-static {v1, v3, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "mobileanalytics"

    const-string v3, "mobileanalytics.us-east-1.amazonaws.com"

    invoke-static {v1, v2, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "pinpoint"

    const-string v3, "pinpoint.us-east-1.amazonaws.com"

    invoke-static {v1, v2, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "polly.us-east-1.amazonaws.com"

    invoke-static {v1, v8, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "rekognition"

    const-string v3, "rekognition.us-east-1.amazonaws.com"

    invoke-static {v1, v2, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "s3.amazonaws.com"

    move-object/from16 v3, v17

    invoke-static {v1, v3, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "sdb"

    const-string v3, "sdb.amazonaws.com"

    invoke-static {v1, v2, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "sns.us-east-1.amazonaws.com"

    invoke-static {v1, v14, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "sqs.us-east-1.amazonaws.com"

    invoke-static {v1, v10, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-static {v1, v4, v5, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v2, "us-east-2"

    invoke-direct {v1, v2, v13}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v2, v20

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v3, "autoscaling.us-east-2.amazonaws.com"

    move-object/from16 v2, v19

    invoke-static {v1, v2, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "cognito-identity.us-east-2.amazonaws.com"

    move-object/from16 v2, v23

    invoke-static {v1, v2, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "cognito-idp.us-east-2.amazonaws.com"

    move-object/from16 v2, v24

    invoke-static {v1, v2, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "cognito-sync.us-east-2.amazonaws.com"

    move-object/from16 v2, v25

    invoke-static {v1, v2, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "dynamodb.us-east-2.amazonaws.com"

    invoke-static {v1, v11, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "ec2.us-east-2.amazonaws.com"

    invoke-static {v1, v12, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "elasticloadbalancing.us-east-2.amazonaws.com"

    move-object/from16 v2, v18

    invoke-static {v1, v2, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "firehose"

    const-string v2, "firehose.us-east-2.amazonaws.com"

    invoke-static {v1, v3, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "iot.us-east-2.amazonaws.com"

    move-object/from16 v3, v22

    invoke-static {v1, v3, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "kinesis.us-east-2.amazonaws.com"

    invoke-static {v1, v7, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "kms.us-east-2.amazonaws.com"

    invoke-static {v1, v6, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "lambda.us-east-2.amazonaws.com"

    invoke-static {v1, v9, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "logs.us-east-2.amazonaws.com"

    move-object/from16 v3, v21

    invoke-static {v1, v3, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "polly.us-east-2.amazonaws.com"

    invoke-static {v1, v8, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "s3.us-east-2.amazonaws.com"

    move-object/from16 v21, v8

    move-object/from16 v8, v17

    invoke-static {v1, v8, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "sns.us-east-2.amazonaws.com"

    invoke-static {v1, v14, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "sqs.us-east-2.amazonaws.com"

    invoke-static {v1, v10, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-static {v1, v4, v5, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v2, "us-west-1"

    invoke-direct {v1, v2, v13}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v2, v20

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v2, "autoscaling.us-west-1.amazonaws.com"

    move-object/from16 v17, v13

    move-object/from16 v13, v19

    invoke-static {v1, v13, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "dynamodb.us-west-1.amazonaws.com"

    invoke-static {v1, v11, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "ec2.us-west-1.amazonaws.com"

    invoke-static {v1, v12, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "elasticloadbalancing.us-west-1.amazonaws.com"

    move-object/from16 v19, v12

    move-object/from16 v12, v18

    invoke-static {v1, v12, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "kinesis.us-west-1.amazonaws.com"

    invoke-static {v1, v7, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "kms.us-west-1.amazonaws.com"

    invoke-static {v1, v6, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "lambda.us-west-1.amazonaws.com"

    invoke-static {v1, v9, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "logs.us-west-1.amazonaws.com"

    invoke-static {v1, v3, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "polly.us-west-1.amazonaws.com"

    move-object/from16 v18, v3

    move-object/from16 v3, v21

    invoke-static {v1, v3, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "s3.us-west-1.amazonaws.com"

    invoke-static {v1, v8, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "sdb"

    move-object/from16 v21, v8

    const-string v8, "sdb.us-west-1.amazonaws.com"

    invoke-static {v1, v2, v8, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "sns.us-west-1.amazonaws.com"

    invoke-static {v1, v14, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v2, "sqs.us-west-1.amazonaws.com"

    invoke-static {v1, v10, v2, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-static {v1, v4, v5, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v2, "us-west-2"

    move-object/from16 v8, v17

    invoke-direct {v1, v2, v8}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v2, v20

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v8, "autoscaling.us-west-2.amazonaws.com"

    invoke-static {v1, v13, v8, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v8, "cognito-identity.us-west-2.amazonaws.com"

    move-object/from16 v20, v13

    move-object/from16 v13, v23

    invoke-static {v1, v13, v8, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v8, "cognito-idp.us-west-2.amazonaws.com"

    move-object/from16 v13, v24

    invoke-static {v1, v13, v8, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v8, "cognito-sync.us-west-2.amazonaws.com"

    move-object/from16 v13, v25

    invoke-static {v1, v13, v8, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v8, "data.iot.us-west-2.amazonaws.com"

    move-object/from16 v13, v16

    invoke-static {v1, v13, v8, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v8, "dynamodb.us-west-2.amazonaws.com"

    invoke-static {v1, v11, v8, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v8, "ec2.us-west-2.amazonaws.com"

    move-object/from16 v13, v19

    invoke-static {v1, v13, v8, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v8, "elasticloadbalancing.us-west-2.amazonaws.com"

    invoke-static {v1, v12, v8, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v8, "email"

    move-object/from16 v19, v12

    const-string v12, "email.us-west-2.amazonaws.com"

    invoke-static {v1, v8, v12, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v8, "firehose"

    const-string v12, "firehose.us-west-2.amazonaws.com"

    invoke-static {v1, v8, v12, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v8, "iot.us-west-2.amazonaws.com"

    move-object/from16 v12, v22

    invoke-static {v1, v12, v8, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v8, "kinesis.us-west-2.amazonaws.com"

    invoke-static {v1, v7, v8, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v8, "kms.us-west-2.amazonaws.com"

    invoke-static {v1, v6, v8, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v8, "lambda.us-west-2.amazonaws.com"

    invoke-static {v1, v9, v8, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v8, "logs.us-west-2.amazonaws.com"

    move-object/from16 v22, v6

    move-object/from16 v6, v18

    invoke-static {v1, v6, v8, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v8, "polly.us-west-2.amazonaws.com"

    invoke-static {v1, v3, v8, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v8, "rekognition"

    move-object/from16 v18, v3

    const-string v3, "rekognition.us-west-2.amazonaws.com"

    invoke-static {v1, v8, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "s3.us-west-2.amazonaws.com"

    move-object/from16 v8, v21

    invoke-static {v1, v8, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "sdb"

    const-string v8, "sdb.us-west-2.amazonaws.com"

    invoke-static {v1, v3, v8, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "sns.us-west-2.amazonaws.com"

    invoke-static {v1, v14, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "sqs.us-west-2.amazonaws.com"

    invoke-static {v1, v10, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-static {v1, v4, v5, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v3, "cn-north-1"

    const-string v8, "amazonaws.com.cn"

    invoke-direct {v1, v3, v8}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v3, "autoscaling.cn-north-1.amazonaws.com.cn"

    move-object/from16 v8, v20

    invoke-static {v1, v8, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "cognito-identity.cn-north-1.amazonaws.com.cn"

    move-object/from16 v20, v5

    move-object/from16 v5, v23

    invoke-static {v1, v5, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "dynamodb.cn-north-1.amazonaws.com.cn"

    invoke-static {v1, v11, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "ec2.cn-north-1.amazonaws.com.cn"

    invoke-static {v1, v13, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "elasticloadbalancing.cn-north-1.amazonaws.com.cn"

    move-object/from16 v5, v19

    invoke-static {v1, v5, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "iot.cn-north-1.amazonaws.com.cn"

    invoke-static {v1, v12, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "kinesis.cn-north-1.amazonaws.com.cn"

    invoke-static {v1, v7, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "lambda.cn-north-1.amazonaws.com.cn"

    invoke-static {v1, v9, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "logs.cn-north-1.amazonaws.com.cn"

    invoke-static {v1, v6, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "s3.cn-north-1.amazonaws.com.cn"

    move-object/from16 v19, v12

    move-object/from16 v12, v21

    invoke-static {v1, v12, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "sns.cn-north-1.amazonaws.com.cn"

    invoke-static {v1, v14, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "sqs.cn-north-1.amazonaws.com.cn"

    invoke-static {v1, v10, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v3, "sts.cn-north-1.amazonaws.com.cn"

    invoke-static {v1, v4, v3, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v3, "cn-northwest-1"

    const-string v0, "amazonaws.com.cn"

    invoke-direct {v1, v3, v0}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, "autoscaling.cn-northwest-1.amazonaws.com.cn"

    const/4 v3, 0x1

    invoke-static {v1, v8, v0, v15, v3}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v0, "dynamodb.cn-northwest-1.amazonaws.com.cn"

    invoke-static {v1, v11, v0, v15, v3}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v0, "ec2.cn-northwest-1.amazonaws.com.cn"

    invoke-static {v1, v13, v0, v15, v3}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v0, "elasticloadbalancing.cn-northwest-1.amazonaws.com.cn"

    invoke-static {v1, v5, v0, v15, v3}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v0, "kinesis.cn-northwest-1.amazonaws.com.cn"

    invoke-static {v1, v7, v0, v15, v3}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v0, "logs.cn-northwest-1.amazonaws.com.cn"

    invoke-static {v1, v6, v0, v15, v3}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v0, "s3.cn-northwest-1.amazonaws.com.cn"

    invoke-static {v1, v12, v0, v15, v3}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v0, "sns.cn-northwest-1.amazonaws.com.cn"

    invoke-static {v1, v14, v0, v15, v3}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v0, "sqs.cn-northwest-1.amazonaws.com.cn"

    invoke-static {v1, v10, v0, v15, v3}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v0, "sts.amazonaws.com.cn"

    invoke-static {v1, v4, v0, v15, v3}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v0, Lcom/amazonaws/regions/Region;

    const-string v1, "us-gov-west-1"

    move-object/from16 v3, v17

    invoke-direct {v0, v1, v3}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v1, "autoscaling.us-gov-west-1.amazonaws.com"

    move-object/from16 v17, v2

    const/4 v2, 0x1

    invoke-static {v0, v8, v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v1, "dynamodb.us-gov-west-1.amazonaws.com"

    invoke-static {v0, v11, v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v1, "ec2.us-gov-west-1.amazonaws.com"

    invoke-static {v0, v13, v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v1, "elasticloadbalancing.us-gov-west-1.amazonaws.com"

    invoke-static {v0, v5, v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v1, "kinesis.us-gov-west-1.amazonaws.com"

    invoke-static {v0, v7, v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v1, "kms.us-gov-west-1.amazonaws.com"

    move-object/from16 v21, v7

    move-object/from16 v7, v22

    invoke-static {v0, v7, v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v1, "lambda.us-gov-west-1.amazonaws.com"

    invoke-static {v0, v9, v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v1, "logs.us-gov-west-1.amazonaws.com"

    invoke-static {v0, v6, v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v1, "rekognition"

    move-object/from16 v22, v6

    const-string v6, "rekognition.us-gov-west-1.amazonaws.com"

    invoke-static {v0, v1, v6, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v1, "s3.us-gov-west-1.amazonaws.com"

    invoke-static {v0, v12, v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v1, "sns.us-gov-west-1.amazonaws.com"

    invoke-static {v0, v14, v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v1, "sqs.us-gov-west-1.amazonaws.com"

    invoke-static {v0, v10, v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    move-object/from16 v1, v20

    invoke-static {v0, v4, v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v0, Lcom/amazonaws/regions/Region;

    const-string v6, "eu-north-1"

    invoke-direct {v0, v6, v3}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v6, v17

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v20, v6

    const-string v6, "autoscaling.eu-north-1.amazonaws.com"

    invoke-static {v0, v8, v6, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "dynamodb.eu-north-1.amazonaws.com"

    invoke-static {v0, v11, v6, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "ec2.eu-north-1.amazonaws.com"

    invoke-static {v0, v13, v6, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "elasticloadbalancing.eu-north-1.amazonaws.com"

    invoke-static {v0, v5, v6, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v6, "firehose"

    move-object/from16 v17, v5

    const-string v5, "firehose.eu-north-1.amazonaws.com"

    invoke-static {v0, v6, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "iot.eu-north-1.amazonaws.com"

    move-object/from16 v6, v19

    invoke-static {v0, v6, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "kinesis.eu-north-1.amazonaws.com"

    move-object/from16 v6, v21

    invoke-static {v0, v6, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "kms.eu-north-1.amazonaws.com"

    invoke-static {v0, v7, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "lambda.eu-north-1.amazonaws.com"

    invoke-static {v0, v9, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "logs.eu-north-1.amazonaws.com"

    move-object/from16 v21, v9

    move-object/from16 v9, v22

    invoke-static {v0, v9, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "s3.eu-north-1.amazonaws.com"

    invoke-static {v0, v12, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "sns.eu-north-1.amazonaws.com"

    invoke-static {v0, v14, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "sqs.eu-north-1.amazonaws.com"

    invoke-static {v0, v10, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-static {v0, v4, v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v0, Lcom/amazonaws/regions/Region;

    const-string v5, "ap-east-1"

    invoke-direct {v0, v5, v3}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v5, v20

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v5, "autoscaling.ap-east-1.amazonaws.com"

    invoke-static {v0, v8, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "dynamodb.ap-east-1.amazonaws.com"

    invoke-static {v0, v11, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "ec2.ap-east-1.amazonaws.com"

    invoke-static {v0, v13, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "elasticloadbalancing.ap-east-1.amazonaws.com"

    move-object/from16 v22, v13

    move-object/from16 v13, v17

    invoke-static {v0, v13, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "firehose"

    const-string v13, "firehose.ap-east-1.amazonaws.com"

    invoke-static {v0, v5, v13, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "kinesis.ap-east-1.amazonaws.com"

    invoke-static {v0, v6, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "kms.ap-east-1.amazonaws.com"

    invoke-static {v0, v7, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "lambda.ap-east-1.amazonaws.com"

    move-object/from16 v13, v21

    invoke-static {v0, v13, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "logs.ap-east-1.amazonaws.com"

    invoke-static {v0, v9, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "polly.ap-east-1.amazonaws.com"

    move-object/from16 v21, v9

    move-object/from16 v9, v18

    invoke-static {v0, v9, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "s3.ap-east-1.amazonaws.com"

    invoke-static {v0, v12, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "sns.ap-east-1.amazonaws.com"

    invoke-static {v0, v14, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "sqs.ap-east-1.amazonaws.com"

    invoke-static {v0, v10, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-static {v0, v4, v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v0, Lcom/amazonaws/regions/Region;

    const-string v5, "me-south-1"

    invoke-direct {v0, v5, v3}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v3, v20

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v5, "autoscaling.me-south-1.amazonaws.com"

    invoke-static {v0, v8, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "cognito-identity.me-south-1.amazonaws.com"

    move-object/from16 v8, v23

    invoke-static {v0, v8, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "cognito-idp.me-south-1.amazonaws.com"

    move-object/from16 v8, v24

    invoke-static {v0, v8, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "cognito-sync.me-south-1.amazonaws.com"

    move-object/from16 v8, v25

    invoke-static {v0, v8, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "data.iot.me-south-1.amazonaws.com"

    move-object/from16 v8, v16

    invoke-static {v0, v8, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "dynamodb.me-south-1.amazonaws.com"

    invoke-static {v0, v11, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "ec2.me-south-1.amazonaws.com"

    move-object/from16 v8, v22

    invoke-static {v0, v8, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "elasticloadbalancing.me-south-1.amazonaws.com"

    move-object/from16 v8, v17

    invoke-static {v0, v8, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "firehose"

    const-string v8, "firehose.me-south-1.amazonaws.com"

    invoke-static {v0, v5, v8, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "iot.me-south-1.amazonaws.com"

    move-object/from16 v8, v19

    invoke-static {v0, v8, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "kinesis.me-south-1.amazonaws.com"

    invoke-static {v0, v6, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "kms.me-south-1.amazonaws.com"

    invoke-static {v0, v7, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "lambda.me-south-1.amazonaws.com"

    invoke-static {v0, v13, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "logs.me-south-1.amazonaws.com"

    move-object/from16 v6, v21

    invoke-static {v0, v6, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "polly.me-south-1.amazonaws.com"

    invoke-static {v0, v9, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "s3.me-south-1.amazonaws.com"

    invoke-static {v0, v12, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "sdb"

    const-string v6, "sdb.me-south-1.amazonaws.com"

    invoke-static {v0, v5, v6, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "sns.me-south-1.amazonaws.com"

    invoke-static {v0, v14, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    const-string v5, "sqs.me-south-1.amazonaws.com"

    invoke-static {v0, v10, v5, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-static {v0, v4, v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-object v3
.end method

.method private static updateRegion(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 2

    invoke-virtual {p0}, Lcom/amazonaws/regions/Region;->getServiceEndpoints()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/amazonaws/regions/Region;->getHttpSupport()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p0}, Lcom/amazonaws/regions/Region;->getHttpsSupport()Ljava/util/Map;

    move-result-object p0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
