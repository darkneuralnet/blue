.class public final enum Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

.field public static final enum d:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

.field public static final enum e:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

.field public static final enum f:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

.field public static final enum g:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

.field public static final synthetic h:[Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;->c:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    new-instance v1, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    const-string v3, "CONFIG_UPDATE_STREAM_ERROR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;->d:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    new-instance v3, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    const-string v5, "CONFIG_UPDATE_MESSAGE_INVALID"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;->e:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    new-instance v5, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    const-string v7, "CONFIG_UPDATE_NOT_FETCHED"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;->f:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    new-instance v7, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    const-string v9, "CONFIG_UPDATE_UNAVAILABLE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;->g:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    const/4 v9, 0x5

    new-array v9, v9, [Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;->h:[Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;
    .locals 1

    const-class v0, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    return-object p0
.end method

.method public static values()[Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;
    .locals 1

    sget-object v0, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;->h:[Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    invoke-virtual {v0}, [Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    return-object v0
.end method
