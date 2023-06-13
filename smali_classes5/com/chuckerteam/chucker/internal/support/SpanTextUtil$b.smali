.class public final enum Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u0082\u0001\u0018\u0000 \u00062\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0017\u0008\u0002\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\t\u0010\nR\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;",
        "",
        "",
        "",
        "b",
        "Ljava/util/Set;",
        "c",
        "()Ljava/util/Set;",
        "delimiters",
        "<init>",
        "(Ljava/lang/String;ILjava/util/Set;)V",
        "a",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "com.github.ChuckerTeam.Chucker.library"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSpanTextUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanTextUtil.kt\ncom/chuckerteam/chucker/internal/support/SpanTextUtil$TokenType\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,188:1\n11335#2:189\n11670#2,3:190\n*S KotlinDebug\n*F\n+ 1 SpanTextUtil.kt\ncom/chuckerteam/chucker/internal/support/SpanTextUtil$TokenType\n*L\n44#1:189\n44#1:190,3\n*E\n"
    }
.end annotation


# static fields
.field public static final c:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b$a;

.field public static final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum e:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

.field public static final enum f:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

.field public static final enum g:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

.field public static final enum h:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

.field public static final enum i:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

.field public static final enum j:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

.field public static final enum k:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

.field public static final synthetic l:[Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;


# instance fields
.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    const-string v1, "\""

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    const-string v2, "STRING"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;-><init>(Ljava/lang/String;ILjava/util/Set;)V

    sput-object v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->e:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    new-instance v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    const-string v1, "["

    const-string v2, "]"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    const-string v2, "ARRAY"

    const/4 v4, 0x1

    invoke-direct {v0, v2, v4, v1}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;-><init>(Ljava/lang/String;ILjava/util/Set;)V

    sput-object v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->f:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    new-instance v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    const-string v1, "{"

    const-string v2, "}"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    const-string v2, "OBJECT"

    const/4 v4, 0x2

    invoke-direct {v0, v2, v4, v1}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;-><init>(Ljava/lang/String;ILjava/util/Set;)V

    sput-object v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->g:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    new-instance v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    const-string v1, ":"

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    const-string v2, "KEY_SEPARATOR"

    const/4 v4, 0x3

    invoke-direct {v0, v2, v4, v1}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;-><init>(Ljava/lang/String;ILjava/util/Set;)V

    sput-object v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->h:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    new-instance v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    const-string v1, ","

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    const-string v2, "VALUE_SEPARATOR"

    const/4 v4, 0x4

    invoke-direct {v0, v2, v4, v1}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;-><init>(Ljava/lang/String;ILjava/util/Set;)V

    sput-object v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->i:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    new-instance v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    const-string v1, "true"

    const-string v2, "false"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    const-string v2, "BOOLEAN"

    const/4 v4, 0x5

    invoke-direct {v0, v2, v4, v1}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;-><init>(Ljava/lang/String;ILjava/util/Set;)V

    sput-object v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->j:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    new-instance v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    const/4 v1, 0x6

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v2

    const-string v4, "NONE"

    invoke-direct {v0, v4, v1, v2}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;-><init>(Ljava/lang/String;ILjava/util/Set;)V

    sput-object v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->k:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    invoke-static {}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->a()[Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    move-result-object v0

    sput-object v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->l:[Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    new-instance v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->c:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b$a;

    invoke-static {}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->values()[Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    iget-object v4, v4, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->b:Ljava/util/Set;

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->flatten(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->d:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->b:Ljava/util/Set;

    return-void
.end method

.method public static final synthetic a()[Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    const/4 v1, 0x0

    sget-object v2, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->e:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->f:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->g:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->h:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->i:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->j:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->k:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static final synthetic b()Ljava/util/Set;
    .locals 1

    sget-object v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->d:Ljava/util/Set;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;
    .locals 1

    const-class v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    return-object p0
.end method

.method public static values()[Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;
    .locals 1

    sget-object v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->l:[Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    return-object v0
.end method


# virtual methods
.method public final c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->b:Ljava/util/Set;

    return-object v0
.end method
