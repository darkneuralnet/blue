.class public final LD16$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD16;->a(Lo32;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LF96$b<",
        "Lo32;",
        ">;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Ltm1<",
        "Ljava/lang/Float;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final g:LD16$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LD16$e;

    invoke-direct {v0}, LD16$e;-><init>()V

    sput-object v0, LD16$e;->g:LD16$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF96$b;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LD16$e;->invoke(LF96$b;LEt0;I)Ltm1;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(LF96$b;LEt0;I)Ltm1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF96$b<",
            "Lo32;",
            ">;",
            "LEt0;",
            "I)",
            "Ltm1<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    const-string v0, "$this$animateFloat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x405ece8d

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:291)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object p3, Lo32;->b:Lo32;

    sget-object v0, Lo32;->c:Lo32;

    invoke-interface {p1, p3, v0}, LF96$b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v2, 0x43

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-static {}, Li91;->c()Lh91;

    move-result-object p1

    const/4 p3, 0x2

    const/4 v0, 0x0

    invoke-static {v2, v0, p1, p3, v3}, Lmf;->k(IILh91;ILjava/lang/Object;)Ltb6;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-interface {p1, v0, p3}, LF96$b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_3

    sget-object p3, Lo32;->d:Lo32;

    invoke-interface {p1, p3, v0}, LF96$b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x7

    const/4 p3, 0x0

    invoke-static {p3, p3, v3, p1, v3}, Lmf;->i(FFLjava/lang/Object;ILjava/lang/Object;)LjO5;

    move-result-object p1

    goto :goto_1

    :cond_3
    :goto_0
    const/16 p1, 0x53

    invoke-static {}, Li91;->c()Lh91;

    move-result-object p3

    invoke-static {p1, v2, p3}, Lmf;->j(IILh91;)Ltb6;

    move-result-object p1

    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {p2}, LEt0;->Q()V

    return-object p1
.end method
