.class public final enum Lcom/stripe/android/stripe3ds2/security/DirectoryServer;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/security/DirectoryServer$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/stripe3ds2/security/DirectoryServer;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0080\u0001\u0018\u0000 \u001b2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB3\u0008\u0002\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\r\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00168F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018j\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 j\u0002\u0008!j\u0002\u0008\"\u00a8\u0006#"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/security/DirectoryServer;",
        "",
        "",
        "",
        "ids",
        "Ljava/util/List;",
        "getIds",
        "()Ljava/util/List;",
        "Lcom/stripe/android/stripe3ds2/security/Algorithm;",
        "algorithm",
        "Lcom/stripe/android/stripe3ds2/security/Algorithm;",
        "getAlgorithm",
        "()Lcom/stripe/android/stripe3ds2/security/Algorithm;",
        "fileName",
        "Ljava/lang/String;",
        "getFileName",
        "()Ljava/lang/String;",
        "LRk2;",
        "keyUse",
        "LRk2;",
        "getKeyUse",
        "()LRk2;",
        "",
        "isCertificate",
        "()Z",
        "<init>",
        "(Ljava/lang/String;ILjava/util/List;Lcom/stripe/android/stripe3ds2/security/Algorithm;Ljava/lang/String;LRk2;)V",
        "Companion",
        "TestRsa",
        "TestEc",
        "Visa",
        "Mastercard",
        "Amex",
        "Discover",
        "CartesBancaires",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

.field public static final enum Amex:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

.field private static final CERTIFICATE_EXTENSIONS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum CartesBancaires:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

.field public static final Companion:Lcom/stripe/android/stripe3ds2/security/DirectoryServer$Companion;

.field public static final enum Discover:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

.field public static final enum Mastercard:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

.field public static final enum TestEc:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

.field public static final enum TestRsa:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

.field public static final enum Visa:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;


# instance fields
.field private final algorithm:Lcom/stripe/android/stripe3ds2/security/Algorithm;

.field private final fileName:Ljava/lang/String;

.field private final ids:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final keyUse:LRk2;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/stripe3ds2/security/DirectoryServer;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->TestRsa:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->TestEc:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->Visa:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->Mastercard:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->Amex:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->Discover:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->CartesBancaires:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 20

    new-instance v9, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    const-string v1, "TestRsa"

    const/4 v2, 0x0

    const-string v0, "F055545342"

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    sget-object v19, Lcom/stripe/android/stripe3ds2/security/Algorithm;->RSA:Lcom/stripe/android/stripe3ds2/security/Algorithm;

    const-string v5, "ds-test-rsa.txt"

    const/4 v6, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    move-object v0, v9

    move-object/from16 v4, v19

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;-><init>(Ljava/lang/String;ILjava/util/List;Lcom/stripe/android/stripe3ds2/security/Algorithm;Ljava/lang/String;LRk2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v9, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->TestRsa:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    new-instance v0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    const-string v11, "TestEc"

    const/4 v12, 0x1

    const-string v1, "F155545342"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    sget-object v14, Lcom/stripe/android/stripe3ds2/security/Algorithm;->EC:Lcom/stripe/android/stripe3ds2/security/Algorithm;

    const-string v15, "ds-test-ec.txt"

    const/16 v16, 0x0

    const/16 v17, 0x8

    const/16 v18, 0x0

    move-object v10, v0

    invoke-direct/range {v10 .. v18}, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;-><init>(Ljava/lang/String;ILjava/util/List;Lcom/stripe/android/stripe3ds2/security/Algorithm;Ljava/lang/String;LRk2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->TestEc:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    new-instance v0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    const-string v11, "Visa"

    const/4 v12, 0x2

    const-string v1, "A000000003"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const-string v15, "ds-visa.crt"

    move-object v10, v0

    move-object/from16 v14, v19

    invoke-direct/range {v10 .. v18}, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;-><init>(Ljava/lang/String;ILjava/util/List;Lcom/stripe/android/stripe3ds2/security/Algorithm;Ljava/lang/String;LRk2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->Visa:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    new-instance v0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    const-string v11, "Mastercard"

    const/4 v12, 0x3

    const-string v1, "A000000004"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const-string v15, "ds-mastercard.crt"

    move-object v10, v0

    invoke-direct/range {v10 .. v18}, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;-><init>(Ljava/lang/String;ILjava/util/List;Lcom/stripe/android/stripe3ds2/security/Algorithm;Ljava/lang/String;LRk2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->Mastercard:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    new-instance v0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    const-string v11, "Amex"

    const/4 v12, 0x4

    const-string v1, "A000000025"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const-string v15, "ds-amex.pem"

    move-object v10, v0

    invoke-direct/range {v10 .. v18}, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;-><init>(Ljava/lang/String;ILjava/util/List;Lcom/stripe/android/stripe3ds2/security/Algorithm;Ljava/lang/String;LRk2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->Amex:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    new-instance v0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    const-string v11, "Discover"

    const/4 v12, 0x5

    const-string v1, "A000000152"

    const-string v2, "A000000324"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const-string v15, "ds-discover.cer"

    move-object v10, v0

    invoke-direct/range {v10 .. v16}, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;-><init>(Ljava/lang/String;ILjava/util/List;Lcom/stripe/android/stripe3ds2/security/Algorithm;Ljava/lang/String;LRk2;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->Discover:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    new-instance v0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    const-string v11, "CartesBancaires"

    const/4 v12, 0x6

    const-string v1, "A000000042"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const-string v15, "ds-cartesbancaires.pem"

    move-object v10, v0

    invoke-direct/range {v10 .. v18}, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;-><init>(Ljava/lang/String;ILjava/util/List;Lcom/stripe/android/stripe3ds2/security/Algorithm;Ljava/lang/String;LRk2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->CartesBancaires:Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    invoke-static {}, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->$values()[Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->$VALUES:[Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    new-instance v0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/security/DirectoryServer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->Companion:Lcom/stripe/android/stripe3ds2/security/DirectoryServer$Companion;

    const-string v0, ".cer"

    const-string v1, ".pem"

    const-string v2, ".crt"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->CERTIFICATE_EXTENSIONS:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/util/List;Lcom/stripe/android/stripe3ds2/security/Algorithm;Ljava/lang/String;LRk2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/stripe3ds2/security/Algorithm;",
            "Ljava/lang/String;",
            "LRk2;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->ids:Ljava/util/List;

    iput-object p4, p0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->algorithm:Lcom/stripe/android/stripe3ds2/security/Algorithm;

    iput-object p5, p0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->fileName:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->keyUse:LRk2;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/util/List;Lcom/stripe/android/stripe3ds2/security/Algorithm;Ljava/lang/String;LRk2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_0

    sget-object p6, LRk2;->c:LRk2;

    :cond_0
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;-><init>(Ljava/lang/String;ILjava/util/List;Lcom/stripe/android/stripe3ds2/security/Algorithm;Ljava/lang/String;LRk2;)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/security/DirectoryServer;
    .locals 1

    const-class v0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/stripe3ds2/security/DirectoryServer;
    .locals 1

    sget-object v0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->$VALUES:[Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    return-object v0
.end method


# virtual methods
.method public final getAlgorithm()Lcom/stripe/android/stripe3ds2/security/Algorithm;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->algorithm:Lcom/stripe/android/stripe3ds2/security/Algorithm;

    return-object v0
.end method

.method public final getFileName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->fileName:Ljava/lang/String;

    return-object v0
.end method

.method public final getIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->ids:Ljava/util/List;

    return-object v0
.end method

.method public final getKeyUse()LRk2;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->keyUse:LRk2;

    return-object v0
.end method

.method public final isCertificate()Z
    .locals 6

    sget-object v0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->CERTIFICATE_EXTENSIONS:Ljava/util/Set;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->fileName:Ljava/lang/String;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v3, v1, v2, v4, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    :cond_2
    :goto_0
    return v2
.end method
