.class public final Lkv2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\nJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u001c\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028GX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0006\u0010\u0004\u00a8\u0006\r"
    }
    d2 = {
        "Lkv2;",
        "",
        "LnN5;",
        "a",
        "(LEt0;I)LnN5;",
        "LU94;",
        "b",
        "LU94;",
        "LocalSoftwareKeyboardController",
        "getCurrent$annotations",
        "()V",
        "current",
        "<init>",
        "ui_release"
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
        "SMAP\nLocalSoftwareKeyboardController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalSoftwareKeyboardController.kt\nandroidx/compose/ui/platform/LocalSoftwareKeyboardController\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,76:1\n76#2:77\n76#2:78\n36#3:79\n1114#4,6:80\n*S KotlinDebug\n*F\n+ 1 LocalSoftwareKeyboardController.kt\nandroidx/compose/ui/platform/LocalSoftwareKeyboardController\n*L\n42#1:77\n47#1:78\n48#1:79\n48#1:80,6\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lkv2;

.field public static final b:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "LnN5;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkv2;

    invoke-direct {v0}, Lkv2;-><init>()V

    sput-object v0, Lkv2;->a:Lkv2;

    sget-object v0, Lkv2$a;->g:Lkv2$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Lgu0;->c(LEM5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LU94;

    move-result-object v0

    sput-object v0, Lkv2;->b:LU94;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEt0;I)LnN5;
    .locals 3

    const v0, 0x6d68c1b8

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.ui.platform.LocalSoftwareKeyboardController.delegatingController (LocalSoftwareKeyboardController.kt:45)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Lhu0;->n()LU94;

    move-result-object p2

    invoke-interface {p1, p2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LU16;

    if-nez p2, :cond_2

    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    const/4 p1, 0x0

    return-object p1

    :cond_2
    sget v0, LU16;->c:I

    const v0, 0x44faf204

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-interface {p1, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_3

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_4

    :cond_3
    new-instance v1, LRZ0;

    invoke-direct {v1, p2}, LRZ0;-><init>(LU16;)V

    invoke-interface {p1, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p1}, LEt0;->Q()V

    check-cast v1, LRZ0;

    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    invoke-interface {p1}, LEt0;->Q()V

    return-object v1
.end method

.method public final b(LEt0;I)LnN5;
    .locals 3
    .annotation build Lkotlin/jvm/JvmName;
        name = "getCurrent"
    .end annotation

    const v0, -0x3f2652d9

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.ui.platform.LocalSoftwareKeyboardController.<get-current> (LocalSoftwareKeyboardController.kt:40)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, Lkv2;->b:LU94;

    invoke-interface {p1, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LnN5;

    if-nez v0, :cond_1

    and-int/lit8 p2, p2, 0xe

    invoke-virtual {p0, p1, p2}, Lkv2;->a(LEt0;I)LnN5;

    move-result-object v0

    :cond_1
    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {p1}, LEt0;->Q()V

    return-object v0
.end method
