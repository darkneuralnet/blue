.class public final LVi2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMs5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVi2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\"\u0010\u0012J\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0097\u0001J\u0011\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001R \u0010\u0013\u001a\u00020\u00088\u0016X\u0097D\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000e\u0012\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048VX\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u000c8VX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u000c8VX\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001bR\u0014\u0010!\u001a\u00020\u001e8\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006#"
    }
    d2 = {
        "LVi2$a;",
        "LMs5;",
        "",
        "index",
        "",
        "",
        "g",
        "d",
        "",
        "name",
        "c",
        "f",
        "",
        "i",
        "Ljava/lang/String;",
        "h",
        "()Ljava/lang/String;",
        "getSerialName$annotations",
        "()V",
        "serialName",
        "getAnnotations",
        "()Ljava/util/List;",
        "annotations",
        "e",
        "()I",
        "elementsCount",
        "isInline",
        "()Z",
        "b",
        "isNullable",
        "LTs5;",
        "getKind",
        "()LTs5;",
        "kind",
        "<init>",
        "kotlinx-serialization-json"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final b:LVi2$a;

.field public static final c:Ljava/lang/String;


# instance fields
.field public final synthetic a:LMs5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LVi2$a;

    invoke-direct {v0}, LVi2$a;-><init>()V

    sput-object v0, LVi2$a;->b:LVi2$a;

    const-string v0, "kotlinx.serialization.json.JsonObject"

    sput-object v0, LVi2$a;->c:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {v0}, Lb40;->D(Lkotlin/jvm/internal/StringCompanionObject;)LKj2;

    move-result-object v0

    sget-object v1, LBi2;->a:LBi2;

    invoke-static {v0, v1}, Lb40;->i(LKj2;LKj2;)LKj2;

    move-result-object v0

    invoke-interface {v0}, LKj2;->getDescriptor()LMs5;

    move-result-object v0

    iput-object v0, p0, LVi2$a;->a:LMs5;

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-object v0, p0, LVi2$a;->a:LMs5;

    invoke-interface {v0}, LMs5;->b()Z

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;)I
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LVi2$a;->a:LMs5;

    invoke-interface {v0, p1}, LMs5;->c(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public d(I)LMs5;
    .locals 1

    iget-object v0, p0, LVi2$a;->a:LMs5;

    invoke-interface {v0, p1}, LMs5;->d(I)LMs5;

    move-result-object p1

    return-object p1
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, LVi2$a;->a:LMs5;

    invoke-interface {v0}, LMs5;->e()I

    move-result v0

    return v0
.end method

.method public f(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LVi2$a;->a:LMs5;

    invoke-interface {v0, p1}, LMs5;->f(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public g(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LVi2$a;->a:LMs5;

    invoke-interface {v0, p1}, LMs5;->g(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getAnnotations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LVi2$a;->a:LMs5;

    invoke-interface {v0}, LMs5;->getAnnotations()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getKind()LTs5;
    .locals 1

    iget-object v0, p0, LVi2$a;->a:LMs5;

    invoke-interface {v0}, LMs5;->getKind()LTs5;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    sget-object v0, LVi2$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public i(I)Z
    .locals 1

    iget-object v0, p0, LVi2$a;->a:LMs5;

    invoke-interface {v0, p1}, LMs5;->i(I)Z

    move-result p1

    return p1
.end method

.method public isInline()Z
    .locals 1

    iget-object v0, p0, LVi2$a;->a:LMs5;

    invoke-interface {v0}, LMs5;->isInline()Z

    move-result v0

    return v0
.end method
