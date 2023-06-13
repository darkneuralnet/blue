.class public final Lso2$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lso2$c;->a(LVn2;J)Lvo2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Lkotlin/jvm/functions/Function1<",
        "-",
        "LOU3$a;",
        "+",
        "Lkotlin/Unit;",
        ">;",
        "LyO2;",
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
.field public final synthetic g:LVn2;

.field public final synthetic h:J

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public constructor <init>(LVn2;JII)V
    .locals 0

    iput-object p1, p0, Lso2$c$a;->g:LVn2;

    iput-wide p2, p0, Lso2$c$a;->h:J

    iput p4, p0, Lso2$c$a;->i:I

    iput p5, p0, Lso2$c$a;->j:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(IILkotlin/jvm/functions/Function1;)LyO2;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LOU3$a;",
            "Lkotlin/Unit;",
            ">;)",
            "LyO2;"
        }
    .end annotation

    const-string v0, "placement"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lso2$c$a;->g:LVn2;

    iget-wide v1, p0, Lso2$c$a;->h:J

    iget v3, p0, Lso2$c$a;->i:I

    add-int/2addr p1, v3

    invoke-static {v1, v2, p1}, Lnz0;->g(JI)I

    move-result p1

    iget-wide v1, p0, Lso2$c$a;->h:J

    iget v3, p0, Lso2$c$a;->j:I

    add-int/2addr p2, v3

    invoke-static {v1, v2, p2}, Lnz0;->f(JI)I

    move-result p2

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, p1, p2, v1, p3}, LzO2;->O0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)LyO2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0, p1, p2, p3}, Lso2$c$a;->a(IILkotlin/jvm/functions/Function1;)LyO2;

    move-result-object p1

    return-object p1
.end method
