.class public final Lm16$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm16;->a(LE16;Ljava/lang/String;Lkotlin/jvm/functions/Function2;LEu6;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLe62;LPD3;Ld16;Lkotlin/jvm/functions/Function2;LEt0;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lo32;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lpm0;",
        ">;"
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


# instance fields
.field public final synthetic g:Ld16;

.field public final synthetic h:Z

.field public final synthetic i:Z

.field public final synthetic j:Le62;

.field public final synthetic k:I

.field public final synthetic l:I


# direct methods
.method public constructor <init>(Ld16;ZZLe62;II)V
    .locals 0

    iput-object p1, p0, Lm16$c;->g:Ld16;

    iput-boolean p2, p0, Lm16$c;->h:Z

    iput-boolean p3, p0, Lm16$c;->i:Z

    iput-object p4, p0, Lm16$c;->j:Le62;

    iput p5, p0, Lm16$c;->k:I

    iput p6, p0, Lm16$c;->l:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo32;LEt0;I)J
    .locals 9

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x298f18c6

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    iget-object v3, p0, Lm16$c;->g:Ld16;

    iget-boolean v4, p0, Lm16$c;->h:Z

    sget-object p3, Lo32;->c:Lo32;

    if-ne p1, p3, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, Lm16$c;->i:Z

    :goto_0
    move v5, p1

    iget-object v6, p0, Lm16$c;->j:Le62;

    iget p1, p0, Lm16$c;->k:I

    shr-int/lit8 p1, p1, 0x1b

    and-int/lit8 p1, p1, 0xe

    iget p3, p0, Lm16$c;->l:I

    shl-int/lit8 v0, p3, 0x3

    and-int/lit16 v0, v0, 0x380

    or-int/2addr p1, v0

    and-int/lit16 p3, p3, 0x1c00

    or-int v8, p1, p3

    move-object v7, p2

    invoke-interface/range {v3 .. v8}, Ld16;->h(ZZLe62;LEt0;I)LsP5;

    move-result-object p1

    invoke-interface {p1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpm0;

    invoke-virtual {p1}, Lpm0;->w()J

    move-result-wide v0

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {p2}, LEt0;->Q()V

    return-wide v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo32;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lm16$c;->a(Lo32;LEt0;I)J

    move-result-wide p1

    invoke-static {p1, p2}, Lpm0;->i(J)Lpm0;

    move-result-object p1

    return-object p1
.end method
