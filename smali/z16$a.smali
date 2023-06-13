.class public final Lz16$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz16;->b(LgV2;Lx16;)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LgV2;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "LgV2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LgV2;",
        "c",
        "(LgV2;LEt0;I)LgV2;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTextFieldSelectionManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,68:1\n76#2:69\n25#3:70\n50#3:77\n49#3:78\n1114#4,6:71\n1114#4,6:79\n76#5:85\n102#5,2:86\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n*L\n47#1:69\n48#1:70\n53#1:77\n53#1:78\n48#1:71,6\n53#1:79,6\n48#1:85\n48#1:86,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lx16;


# direct methods
.method public constructor <init>(Lx16;)V
    .locals 0

    iput-object p1, p0, Lz16$a;->g:Lx16;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static final synthetic a(LEX2;)J
    .locals 2

    invoke-static {p0}, Lz16$a;->d(LEX2;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic b(LEX2;J)V
    .locals 0

    invoke-static {p0, p1, p2}, Lz16$a;->e(LEX2;J)V

    return-void
.end method

.method public static final d(LEX2;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "LG52;",
            ">;)J"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LG52;

    invoke-virtual {p0}, LG52;->j()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final e(LEX2;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "LG52;",
            ">;J)V"
        }
    .end annotation

    invoke-static {p1, p2}, LG52;->b(J)LG52;

    move-result-object p1

    invoke-interface {p0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final c(LgV2;LEt0;I)LgV2;
    .locals 5

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x760d4197

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:45)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Lhu0;->g()LU94;

    move-result-object p3

    invoke-interface {p2, p3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lg01;

    const v0, -0x1d58f75c

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_1

    sget-object v0, LG52;->b:LG52$a;

    invoke-virtual {v0}, LG52$a;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, LG52;->b(J)LG52;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v0

    invoke-interface {p2, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v0, LEX2;

    new-instance v2, Lz16$a$a;

    iget-object v3, p0, Lz16$a;->g:Lx16;

    invoke-direct {v2, v3, v0}, Lz16$a$a;-><init>(Lx16;LEX2;)V

    const v3, 0x1e7b2b64

    invoke-interface {p2, v3}, LEt0;->F(I)V

    invoke-interface {p2, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p2, p3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_2

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_3

    :cond_2
    new-instance v4, Lz16$a$b;

    invoke-direct {v4, p3, v0}, Lz16$a$b;-><init>(Lg01;LEX2;)V

    invoke-interface {p2, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v2, v4}, LTr5;->g(LgV2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {p2}, LEt0;->Q()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LgV2;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lz16$a;->c(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method
