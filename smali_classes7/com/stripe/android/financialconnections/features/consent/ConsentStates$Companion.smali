.class public final Lcom/stripe/android/financialconnections/features/consent/ConsentStates$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/consent/ConsentStates;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u0008\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/consent/ConsentStates$Companion;",
        "",
        "()V",
        "canonical",
        "Lcom/stripe/android/financialconnections/features/consent/ConsentState;",
        "manualEntryPlusMicrodeposits",
        "sampleConsent",
        "Lcom/stripe/android/financialconnections/model/ConsentPane;",
        "withConnectedAccountLogos",
        "withNoLogos",
        "withPlatformLogos",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentStates$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final canonical()Lcom/stripe/android/financialconnections/features/consent/ConsentState;
    .locals 19

    new-instance v8, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    new-instance v1, LwT5;

    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentStates$Companion;->sampleConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x7d

    const/16 v18, 0x0

    invoke-static/range {v9 .. v18}, Lcom/stripe/android/financialconnections/model/ConsentPane;->copy$default(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v0, v2, v3, v4}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;-><init>(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/util/List;Z)V

    invoke-direct {v1, v0}, LwT5;-><init>(Ljava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1e

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;-><init>(Ldp;Ljava/util/List;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;Ldp;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method public final manualEntryPlusMicrodeposits()Lcom/stripe/android/financialconnections/features/consent/ConsentState;
    .locals 9

    new-instance v8, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    new-instance v1, LwT5;

    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentStates$Companion;->sampleConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v0, v2, v3, v4}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;-><init>(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/util/List;Z)V

    invoke-direct {v1, v0}, LwT5;-><init>(Ljava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1e

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;-><init>(Ldp;Ljava/util/List;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;Ldp;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method public final sampleConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;
    .locals 20

    new-instance v3, Lcom/stripe/android/financialconnections/model/ConsentPaneBody;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/stripe/android/financialconnections/model/Bullet;

    new-instance v1, Lcom/stripe/android/financialconnections/model/Image;

    const-string v2, "https://www.cdn.stripe.com/12321312321.png"

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    new-instance v4, Lcom/stripe/android/financialconnections/model/Bullet;

    const-string v5, "Stripe will allow Goldilocks to access only the data requested"

    invoke-direct {v4, v5, v1, v5}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V

    const/4 v1, 0x0

    aput-object v4, v0, v1

    new-instance v4, Lcom/stripe/android/financialconnections/model/Image;

    invoke-direct {v4, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    new-instance v6, Lcom/stripe/android/financialconnections/model/Bullet;

    invoke-direct {v6, v5, v4, v5}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V

    const/4 v4, 0x1

    aput-object v6, v0, v4

    new-instance v6, Lcom/stripe/android/financialconnections/model/Image;

    invoke-direct {v6, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    new-instance v7, Lcom/stripe/android/financialconnections/model/Bullet;

    invoke-direct {v7, v5, v6, v5}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V

    const/4 v5, 0x2

    aput-object v7, v0, v5

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/stripe/android/financialconnections/model/ConsentPaneBody;-><init>(Ljava/util/List;)V

    new-instance v7, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    new-array v0, v5, [Lcom/stripe/android/financialconnections/model/Bullet;

    new-instance v6, Lcom/stripe/android/financialconnections/model/Image;

    invoke-direct {v6, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    new-instance v8, Lcom/stripe/android/financialconnections/model/Bullet;

    const-string v9, "Account number, routing number, account type, account nickname."

    const-string v10, "Account details"

    invoke-direct {v8, v9, v6, v10}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V

    aput-object v8, v0, v1

    new-instance v6, Lcom/stripe/android/financialconnections/model/Image;

    invoke-direct {v6, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/stripe/android/financialconnections/model/Bullet;

    invoke-direct {v2, v9, v6, v10}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V

    aput-object v2, v0, v4

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v7, v0}, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;-><init>(Ljava/util/List;)V

    new-instance v13, Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    const-string v8, "Goldilocks works with Stripe to link your accounts"

    const-string v9, "Goldilocks will use your account and routing number, balances and transactions:"

    const-string v10, "OK"

    const-string v11, "Learn more about data access"

    const-string v12, "Connected account placeholder"

    move-object v6, v13

    invoke-direct/range {v6 .. v12}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;-><init>(Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/LegalDetailsBody;

    new-array v2, v5, [Lcom/stripe/android/financialconnections/model/Bullet;

    new-instance v11, Lcom/stripe/android/financialconnections/model/Bullet;

    const-string v6, "To improve our services"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x6

    const/4 v10, 0x0

    move-object v5, v11

    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v11, v2, v1

    new-instance v1, Lcom/stripe/android/financialconnections/model/Bullet;

    const-string v15, "To manage fraud and loss risk of transactions"

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x6

    const/16 v19, 0x0

    move-object v14, v1

    invoke-direct/range {v14 .. v19}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v1, v2, v4

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/LegalDetailsBody;-><init>(Ljava/util/List;)V

    new-instance v6, Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    const-string v1, "OK"

    const-string v2, "Learn more"

    const-string v4, "Stripe uses your account data as described in the Terms, including:"

    invoke-direct {v6, v0, v4, v1, v2}, Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;-><init>(Lcom/stripe/android/financialconnections/model/LegalDetailsBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v8, Lcom/stripe/android/financialconnections/model/ConsentPane;

    const-string v1, "Manually verify instead (takes 1-2 business days)"

    const-string v2, "Stripe will allow Goldilocks to access only the data requested. We never share your login details with them."

    const-string v4, "Agree"

    const-string v7, "Goldilocks works with Stripe to link your accounts"

    move-object v0, v8

    move-object v5, v13

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/financialconnections/model/ConsentPane;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;)V

    return-object v8
.end method

.method public final withConnectedAccountLogos()Lcom/stripe/android/financialconnections/features/consent/ConsentState;
    .locals 19

    new-instance v8, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    new-instance v1, LwT5;

    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentStates$Companion;->sampleConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x7d

    const/16 v18, 0x0

    invoke-static/range {v9 .. v18}, Lcom/stripe/android/financialconnections/model/ConsentPane;->copy$default(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v2

    const-string v3, "www.logo2.com"

    const-string v4, "www.logo3.com"

    const-string v5, "www.logo1.com"

    filled-new-array {v5, v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v4}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;-><init>(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/util/List;Z)V

    invoke-direct {v1, v0}, LwT5;-><init>(Ljava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1e

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;-><init>(Ldp;Ljava/util/List;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;Ldp;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method public final withNoLogos()Lcom/stripe/android/financialconnections/features/consent/ConsentState;
    .locals 19

    new-instance v8, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    new-instance v1, LwT5;

    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentStates$Companion;->sampleConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x7d

    const/16 v18, 0x0

    invoke-static/range {v9 .. v18}, Lcom/stripe/android/financialconnections/model/ConsentPane;->copy$default(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v4}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;-><init>(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/util/List;Z)V

    invoke-direct {v1, v0}, LwT5;-><init>(Ljava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1e

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;-><init>(Ldp;Ljava/util/List;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;Ldp;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method public final withPlatformLogos()Lcom/stripe/android/financialconnections/features/consent/ConsentState;
    .locals 19

    new-instance v8, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    new-instance v1, LwT5;

    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentStates$Companion;->sampleConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x7d

    const/16 v18, 0x0

    invoke-static/range {v9 .. v18}, Lcom/stripe/android/financialconnections/model/ConsentPane;->copy$default(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v2

    const-string v3, "www.logo1.com"

    const-string v4, "www.logo2.com"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v4}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;-><init>(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/util/List;Z)V

    invoke-direct {v1, v0}, LwT5;-><init>(Ljava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1e

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;-><init>(Ldp;Ljava/util/List;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;Ldp;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method
