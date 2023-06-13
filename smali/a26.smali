.class public final La26;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u000b\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\n\u001a\u00020\u0008J\u0006\u0010\u000c\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0019"
    }
    d2 = {
        "La26;",
        "",
        "",
        "a",
        "LOs4;",
        "rect",
        "",
        "d",
        "LF16;",
        "oldValue",
        "newValue",
        "f",
        "e",
        "b",
        "LU16;",
        "LU16;",
        "textInputService",
        "LkW3;",
        "LkW3;",
        "platformTextInputService",
        "c",
        "()Z",
        "isOpen",
        "<init>",
        "(LU16;LkW3;)V",
        "ui-text_release"
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
        "SMAP\nTextInputService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n1#1,289:1\n153#1,5:290\n153#1,5:295\n153#1,5:300\n153#1,5:305\n*S KotlinDebug\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n172#1:290,5\n194#1:295,5\n212#1:300,5\n227#1:305,5\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LU16;

.field public final b:LkW3;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LU16;LkW3;)V
    .locals 1

    const-string v0, "textInputService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "platformTextInputService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La26;->a:LU16;

    iput-object p2, p0, La26;->b:LkW3;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, La26;->a:LU16;

    invoke-virtual {v0, p0}, LU16;->e(La26;)V

    return-void
.end method

.method public final b()Z
    .locals 2

    invoke-virtual {p0}, La26;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, La26;->b:LkW3;

    invoke-interface {v1}, LkW3;->c()V

    :cond_0
    return v0
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, La26;->a:LU16;

    invoke-virtual {v0}, LU16;->a()La26;

    move-result-object v0

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final d(LOs4;)Z
    .locals 2

    const-string v0, "rect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, La26;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, La26;->b:LkW3;

    invoke-interface {v1, p1}, LkW3;->d(LOs4;)V

    :cond_0
    return v0
.end method

.method public final e()Z
    .locals 2

    invoke-virtual {p0}, La26;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, La26;->b:LkW3;

    invoke-interface {v1}, LkW3;->e()V

    :cond_0
    return v0
.end method

.method public final f(LF16;LF16;)Z
    .locals 2

    const-string v0, "newValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, La26;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, La26;->b:LkW3;

    invoke-interface {v1, p1, p2}, LkW3;->b(LF16;LF16;)V

    :cond_0
    return v0
.end method
