.class public final Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/auth/PaymentBrowserAuthContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Args"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args$CREATOR;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008+\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0080\u0008\u0018\u0000 G2\u00020\u0001:\u0001GB\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0083\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\r\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\r\u00a2\u0006\u0002\u0010\u0016J\t\u0010)\u001a\u00020\u0006H\u00c6\u0003J\t\u0010*\u001a\u00020\rH\u00c6\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\t\u0010,\u001a\u00020\u0006H\u00c6\u0003J\t\u0010-\u001a\u00020\rH\u00c6\u0003J\t\u0010.\u001a\u00020\u0008H\u00c6\u0003J\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u00102\u001a\u00020\rH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u00105\u001a\u00020\rH\u00c6\u0003J\u0098\u0001\u00106\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\u00062\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0011\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\r2\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0015\u001a\u00020\rH\u00c6\u0001\u00a2\u0006\u0002\u00107J\u0008\u00108\u001a\u00020\u0008H\u0016J\u0013\u00109\u001a\u00020\r2\u0008\u0010:\u001a\u0004\u0018\u00010;H\u00d6\u0003J\u0015\u0010<\u001a\u00020\r2\u0006\u0010=\u001a\u00020>H\u0000\u00a2\u0006\u0002\u0008?J\t\u0010@\u001a\u00020\u0008H\u00d6\u0001J\u0006\u0010A\u001a\u00020BJ\t\u0010C\u001a\u00020\u0006H\u00d6\u0001J\u0018\u0010D\u001a\u00020E2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0008H\u0016R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u0015\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001aR\u0011\u0010\u0011\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001aR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\u0008\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u0018\u00a8\u0006H"
    }
    d2 = {
        "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
        "Landroid/os/Parcelable;",
        "parcel",
        "Landroid/os/Parcel;",
        "(Landroid/os/Parcel;)V",
        "objectId",
        "",
        "requestCode",
        "",
        "clientSecret",
        "url",
        "returnUrl",
        "enableLogging",
        "",
        "toolbarCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;",
        "stripeAccountId",
        "shouldCancelSource",
        "shouldCancelIntentOnUserNavigation",
        "statusBarColor",
        "publishableKey",
        "isInstantApp",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;Z)V",
        "getClientSecret",
        "()Ljava/lang/String;",
        "getEnableLogging",
        "()Z",
        "getObjectId",
        "getPublishableKey",
        "getRequestCode",
        "()I",
        "getReturnUrl",
        "getShouldCancelIntentOnUserNavigation",
        "getShouldCancelSource",
        "getStatusBarColor",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getStripeAccountId",
        "getToolbarCustomization",
        "()Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;",
        "getUrl",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;Z)Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
        "describeContents",
        "equals",
        "other",
        "",
        "hasDefaultReturnUrl",
        "defaultReturnUrl",
        "Lcom/stripe/android/payments/DefaultReturnUrl;",
        "hasDefaultReturnUrl$payments_core_release",
        "hashCode",
        "toBundle",
        "Landroid/os/Bundle;",
        "toString",
        "writeToParcel",
        "",
        "flags",
        "CREATOR",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args$CREATOR;


# instance fields
.field private final clientSecret:Ljava/lang/String;

.field private final enableLogging:Z

.field private final isInstantApp:Z

.field private final objectId:Ljava/lang/String;

.field private final publishableKey:Ljava/lang/String;

.field private final requestCode:I

.field private final returnUrl:Ljava/lang/String;

.field private final shouldCancelIntentOnUserNavigation:Z

.field private final shouldCancelSource:Z

.field private final statusBarColor:Ljava/lang/Integer;

.field private final stripeAccountId:Ljava/lang/String;

.field private final toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

.field private final url:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args$CREATOR;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args$CREATOR;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->CREATOR:Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args$CREATOR;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 17

    move-object/from16 v0, p1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    if-nez v1, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object v4, v1

    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object v6, v1

    :goto_1
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object v7, v1

    :goto_2
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v1

    const/4 v3, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_3

    move v1, v3

    goto :goto_3

    :cond_3
    move v1, v9

    :goto_3
    const-class v10, Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    invoke-virtual {v10}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v10

    invoke-virtual {v0, v10}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v10

    check-cast v10, Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v12

    if-eqz v12, :cond_4

    move v12, v3

    goto :goto_4

    :cond_4
    move v12, v9

    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v13

    if-eqz v13, :cond_5

    move v13, v3

    goto :goto_5

    :cond_5
    move v13, v9

    :goto_5
    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v14}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v14

    invoke-virtual {v0, v14}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v14

    instance-of v15, v14, Ljava/lang/Integer;

    if-eqz v15, :cond_6

    check-cast v14, Ljava/lang/Integer;

    goto :goto_6

    :cond_6
    const/4 v14, 0x0

    :goto_6
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_7

    move-object v15, v2

    :cond_7
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_8

    move/from16 v16, v3

    goto :goto_7

    :cond_8
    move/from16 v16, v9

    :goto_7
    move-object/from16 v3, p0

    move v9, v1

    invoke-direct/range {v3 .. v16}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "objectId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientSecret"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->objectId:Ljava/lang/String;

    iput p2, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->requestCode:I

    iput-object p3, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->clientSecret:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->url:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->returnUrl:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->enableLogging:Z

    iput-object p7, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    iput-object p8, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->stripeAccountId:Ljava/lang/String;

    iput-boolean p9, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->shouldCancelSource:Z

    iput-boolean p10, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->shouldCancelIntentOnUserNavigation:Z

    iput-object p11, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->statusBarColor:Ljava/lang/Integer;

    iput-object p12, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->publishableKey:Ljava/lang/String;

    iput-boolean p13, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->isInstantApp:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v8, v2

    goto :goto_0

    :cond_0
    move-object/from16 v8, p5

    :goto_0
    and-int/lit8 v1, v0, 0x20

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move v9, v3

    goto :goto_1

    :cond_1
    move/from16 v9, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    move-object v10, v2

    goto :goto_2

    :cond_2
    move-object/from16 v10, p7

    :goto_2
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_3

    move-object v11, v2

    goto :goto_3

    :cond_3
    move-object/from16 v11, p8

    :goto_3
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_4

    move v12, v3

    goto :goto_4

    :cond_4
    move/from16 v12, p9

    :goto_4
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_5

    const/4 v1, 0x1

    move v13, v1

    goto :goto_5

    :cond_5
    move/from16 v13, p10

    :goto_5
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_6

    move-object v14, v2

    goto :goto_6

    :cond_6
    move-object/from16 v14, p11

    :goto_6
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v15, p12

    move/from16 v16, p13

    invoke-direct/range {v3 .. v16}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;ZILjava/lang/Object;)Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;
    .locals 14

    move-object v0, p0

    move/from16 v1, p14

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->objectId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->requestCode:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->clientSecret:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->url:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->returnUrl:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->enableLogging:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->stripeAccountId:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->shouldCancelSource:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->shouldCancelIntentOnUserNavigation:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->statusBarColor:Ljava/lang/Integer;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->publishableKey:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v1, v1, 0x1000

    if-eqz v1, :cond_c

    iget-boolean v1, v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->isInstantApp:Z

    goto :goto_c

    :cond_c
    move/from16 v1, p13

    :goto_c
    move-object p1, v2

    move/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move/from16 p13, v1

    invoke-virtual/range {p0 .. p13}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->copy(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;Z)Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->objectId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->shouldCancelIntentOnUserNavigation:Z

    return v0
.end method

.method public final component11()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->statusBarColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->publishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->isInstantApp:Z

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->requestCode:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->clientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->returnUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->enableLogging:Z

    return v0
.end method

.method public final component7()Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->stripeAccountId:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->shouldCancelSource:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;Z)Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;
    .locals 15

    const-string v0, "objectId"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientSecret"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    move-object v1, v0

    move/from16 v3, p2

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    iget-object v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->objectId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->objectId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->requestCode:I

    iget v3, p1, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->requestCode:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->clientSecret:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->clientSecret:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->url:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->url:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->returnUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->returnUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->enableLogging:Z

    iget-boolean v3, p1, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->enableLogging:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    iget-object v3, p1, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->stripeAccountId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->stripeAccountId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->shouldCancelSource:Z

    iget-boolean v3, p1, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->shouldCancelSource:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->shouldCancelIntentOnUserNavigation:Z

    iget-boolean v3, p1, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->shouldCancelIntentOnUserNavigation:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->statusBarColor:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->statusBarColor:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->publishableKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->publishableKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->isInstantApp:Z

    iget-boolean p1, p1, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->isInstantApp:Z

    if-eq v1, p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getClientSecret()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->clientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final getEnableLogging()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->enableLogging:Z

    return v0
.end method

.method public final getObjectId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->objectId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPublishableKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->publishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getRequestCode()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->requestCode:I

    return v0
.end method

.method public final getReturnUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->returnUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getShouldCancelIntentOnUserNavigation()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->shouldCancelIntentOnUserNavigation:Z

    return v0
.end method

.method public final getShouldCancelSource()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->shouldCancelSource:Z

    return v0
.end method

.method public final getStatusBarColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->statusBarColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getStripeAccountId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->stripeAccountId:Ljava/lang/String;

    return-object v0
.end method

.method public final getToolbarCustomization()Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final hasDefaultReturnUrl$payments_core_release(Lcom/stripe/android/payments/DefaultReturnUrl;)Z
    .locals 1

    const-string v0, "defaultReturnUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->returnUrl:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/payments/DefaultReturnUrl;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->objectId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->requestCode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->clientSecret:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->url:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->returnUrl:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->enableLogging:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    move v1, v3

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->stripeAccountId:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->shouldCancelSource:Z

    if-eqz v1, :cond_4

    move v1, v3

    :cond_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->shouldCancelIntentOnUserNavigation:Z

    if-eqz v1, :cond_5

    move v1, v3

    :cond_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->statusBarColor:Ljava/lang/Integer;

    if-nez v1, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->publishableKey:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->isInstantApp:Z

    if-eqz v1, :cond_7

    goto :goto_4

    :cond_7
    move v3, v1

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public final isInstantApp()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->isInstantApp:Z

    return v0
.end method

.method public final toBundle()Landroid/os/Bundle;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "extra_args"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Ld70;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->objectId:Ljava/lang/String;

    iget v1, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->requestCode:I

    iget-object v2, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->clientSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->url:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->returnUrl:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->enableLogging:Z

    iget-object v6, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    iget-object v7, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->stripeAccountId:Ljava/lang/String;

    iget-boolean v8, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->shouldCancelSource:Z

    iget-boolean v9, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->shouldCancelIntentOnUserNavigation:Z

    iget-object v10, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->statusBarColor:Ljava/lang/Integer;

    iget-object v11, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->publishableKey:Ljava/lang/String;

    iget-boolean v12, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->isInstantApp:Z

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Args(objectId="

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", requestCode="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", clientSecret="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", url="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", returnUrl="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", enableLogging="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", toolbarCustomization="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stripeAccountId="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", shouldCancelSource="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", shouldCancelIntentOnUserNavigation="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", statusBarColor="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", publishableKey="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isInstantApp="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->objectId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->requestCode:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->clientSecret:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->url:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->returnUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->enableLogging:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    iget-object v0, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->stripeAccountId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->shouldCancelSource:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean p2, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->shouldCancelIntentOnUserNavigation:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-object p2, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->statusBarColor:Ljava/lang/Integer;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->publishableKey:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->isInstantApp:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    return-void
.end method
