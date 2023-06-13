.class public final LI22;
.super LAW3;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\u0008\u00030\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0012"
    }
    d2 = {
        "LI22;",
        "LAW3;",
        "",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "m",
        "Z",
        "isInline",
        "()Z",
        "",
        "name",
        "LmB1;",
        "generatedSerializer",
        "<init>",
        "(Ljava/lang/String;LmB1;)V",
        "kotlinx-serialization-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/PublishedApi;
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nInlineClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n+ 2 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,44:1\n111#2,10:45\n*S KotlinDebug\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n*L\n22#1:45,10\n*E\n"
    }
.end annotation


# instance fields
.field public final m:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;LmB1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LmB1<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "generatedSerializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, LAW3;-><init>(Ljava/lang/String;LmB1;I)V

    iput-boolean v0, p0, LI22;->m:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    goto/16 :goto_3

    :cond_0
    instance-of v1, p1, LI22;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    :goto_0
    move v0, v2

    goto/16 :goto_3

    :cond_1
    invoke-interface {p0}, LMs5;->h()Ljava/lang/String;

    move-result-object v1

    move-object v3, p1

    check-cast v3, LMs5;

    invoke-interface {v3}, LMs5;->h()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    check-cast p1, LI22;

    invoke-virtual {p1}, LI22;->isInline()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, LAW3;->o()[LMs5;

    move-result-object v1

    invoke-virtual {p1}, LAW3;->o()[LMs5;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    move p1, v0

    goto :goto_1

    :cond_3
    move p1, v2

    :goto_1
    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    invoke-interface {p0}, LMs5;->e()I

    move-result p1

    invoke-interface {v3}, LMs5;->e()I

    move-result v1

    if-eq p1, v1, :cond_5

    goto :goto_0

    :cond_5
    invoke-interface {p0}, LMs5;->e()I

    move-result p1

    move v1, v2

    :goto_2
    if-ge v1, p1, :cond_8

    invoke-interface {p0, v1}, LMs5;->d(I)LMs5;

    move-result-object v4

    invoke-interface {v4}, LMs5;->h()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v1}, LMs5;->d(I)LMs5;

    move-result-object v5

    invoke-interface {v5}, LMs5;->h()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_0

    :cond_6
    invoke-interface {p0, v1}, LMs5;->d(I)LMs5;

    move-result-object v4

    invoke-interface {v4}, LMs5;->getKind()LTs5;

    move-result-object v4

    invoke-interface {v3, v1}, LMs5;->d(I)LMs5;

    move-result-object v5

    invoke-interface {v5}, LMs5;->getKind()LTs5;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto :goto_0

    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_8
    :goto_3
    return v0
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, LAW3;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public isInline()Z
    .locals 1

    iget-boolean v0, p0, LI22;->m:Z

    return v0
.end method
