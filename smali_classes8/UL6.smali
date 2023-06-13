.class public final enum LUL6;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LUL6;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LUL6;

.field public static final enum d:LUL6;

.field public static final synthetic e:[LUL6;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, LUL6;

    const-string v1, "PayPal-Client-Metadata-Id exceeds the maximum length allowed. This is your own unique identifier for the payload. If you do not pass in this value, a new PayPal-Client-Metadata-Id is generated per method call. ***Maximum length: 32 characters***"

    const-string v2, "CMID_EXCEPTION_MESSAGE"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LUL6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LUL6;->c:LUL6;

    new-instance v1, LUL6;

    const-string v2, "Application\u2019s Globally Unique Identifier (AppGUID) exceeds maximum length allowed, This is a string that identifies the merchant application that sets up Magnes on the mobile device. If the merchant app does not pass an AppGuid, Magnes creates one to identify the app. An AppGuid is an application identifier per-installation; that is, if a new instance of the app is installed on the mobile device, or the app is reinstalled, it will have a new AppGuid. ***Maximum length: 36 characters***"

    const-string v4, "APPGUID_EXCEPTION_MESSAGE"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LUL6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LUL6;->d:LUL6;

    const/4 v2, 0x2

    new-array v2, v2, [LUL6;

    aput-object v0, v2, v3

    aput-object v1, v2, v5

    sput-object v2, LUL6;->e:[LUL6;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LUL6;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LUL6;
    .locals 1

    const-class v0, LUL6;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LUL6;

    return-object p0
.end method

.method public static values()[LUL6;
    .locals 1

    sget-object v0, LUL6;->e:[LUL6;

    invoke-virtual {v0}, [LUL6;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LUL6;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, LUL6;->b:Ljava/lang/String;

    return-object v0
.end method
