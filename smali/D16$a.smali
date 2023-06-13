.class public final LD16$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


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
        "Lkotlin/jvm/functions/Function2<",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
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
.field public final synthetic g:LD16;

.field public final synthetic h:Lo32;

.field public final synthetic i:J

.field public final synthetic j:J

.field public final synthetic k:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Lo32;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lpm0;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic l:Z

.field public final synthetic m:Lkotlin/jvm/functions/Function6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function6<",
            "Ljava/lang/Float;",
            "Lpm0;",
            "Lpm0;",
            "Ljava/lang/Float;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic n:I


# direct methods
.method public constructor <init>(LD16;Lo32;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LD16;",
            "Lo32;",
            "JJ",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lo32;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lpm0;",
            ">;Z",
            "Lkotlin/jvm/functions/Function6<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Lpm0;",
            "-",
            "Lpm0;",
            "-",
            "Ljava/lang/Float;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, LD16$a;->g:LD16;

    iput-object p2, p0, LD16$a;->h:Lo32;

    iput-wide p3, p0, LD16$a;->i:J

    iput-wide p5, p0, LD16$a;->j:J

    iput-object p7, p0, LD16$a;->k:Lkotlin/jvm/functions/Function3;

    iput-boolean p8, p0, LD16$a;->l:Z

    iput-object p9, p0, LD16$a;->m:Lkotlin/jvm/functions/Function6;

    iput p10, p0, LD16$a;->n:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LD16$a;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 11

    iget-object v0, p0, LD16$a;->g:LD16;

    iget-object v1, p0, LD16$a;->h:Lo32;

    iget-wide v2, p0, LD16$a;->i:J

    iget-wide v4, p0, LD16$a;->j:J

    iget-object v6, p0, LD16$a;->k:Lkotlin/jvm/functions/Function3;

    iget-boolean v7, p0, LD16$a;->l:Z

    iget-object v8, p0, LD16$a;->m:Lkotlin/jvm/functions/Function6;

    iget p2, p0, LD16$a;->n:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lps4;->a(I)I

    move-result v10

    move-object v9, p1

    invoke-virtual/range {v0 .. v10}, LD16;->a(Lo32;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;LEt0;I)V

    return-void
.end method
