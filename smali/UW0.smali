.class public final LUW0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly12;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUW0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c2\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "LUW0;",
        "Ly12;",
        "Le62;",
        "interactionSource",
        "Lz12;",
        "a",
        "(Le62;LEt0;I)Lz12;",
        "<init>",
        "()V",
        "foundation_release"
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
        "SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/DefaultDebugIndication\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,186:1\n36#2:187\n1114#3,6:188\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/DefaultDebugIndication\n*L\n171#1:187\n171#1:188,6\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LUW0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LUW0;

    invoke-direct {v0}, LUW0;-><init>()V

    sput-object v0, LUW0;->a:LUW0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le62;LEt0;I)Lz12;
    .locals 3

    const-string v0, "interactionSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x64593183

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.DefaultDebugIndication.rememberUpdatedInstance (Indication.kt:166)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 p3, p3, 0xe

    invoke-static {p1, p2, p3}, LS14;->a(Le62;LEt0;I)LsP5;

    move-result-object v0

    invoke-static {p1, p2, p3}, LlN1;->a(Le62;LEt0;I)LsP5;

    move-result-object v1

    invoke-static {p1, p2, p3}, Lzv1;->a(Le62;LEt0;I)LsP5;

    move-result-object p3

    const v2, 0x44faf204

    invoke-interface {p2, v2}, LEt0;->F(I)V

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p1

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez p1, :cond_1

    sget-object p1, LEt0;->a:LEt0$a;

    invoke-virtual {p1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne v2, p1, :cond_2

    :cond_1
    new-instance v2, LUW0$a;

    invoke-direct {v2, v0, v1, p3}, LUW0$a;-><init>(LsP5;LsP5;LsP5;)V

    invoke-interface {p2, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v2, LUW0$a;

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p2}, LEt0;->Q()V

    return-object v2
.end method
