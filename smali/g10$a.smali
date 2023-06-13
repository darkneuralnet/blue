.class public final Lg10$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg10;->a(LgV2;LK9;ZLkotlin/jvm/functions/Function3;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LaT5;",
        "Lkz0;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt$BoxWithConstraints$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LxO2;

.field public final synthetic h:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Lh10;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:I


# direct methods
.method public constructor <init>(LxO2;Lkotlin/jvm/functions/Function3;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxO2;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lh10;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lg10$a;->g:LxO2;

    iput-object p2, p0, Lg10$a;->h:Lkotlin/jvm/functions/Function3;

    iput p3, p0, Lg10$a;->i:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LaT5;J)LyO2;
    .locals 5

    const-string v0, "$this$SubcomposeLayout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li10;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Li10;-><init>(Lg01;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    new-instance v2, Lg10$a$a;

    iget-object v3, p0, Lg10$a;->h:Lkotlin/jvm/functions/Function3;

    iget v4, p0, Lg10$a;->i:I

    invoke-direct {v2, v3, v0, v4}, Lg10$a$a;-><init>(Lkotlin/jvm/functions/Function3;Li10;I)V

    const v0, -0x73eea2c7

    const/4 v3, 0x1

    invoke-static {v0, v3, v2}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LaT5;->q0(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lg10$a;->g:LxO2;

    invoke-interface {v1, p1, v0, p2, p3}, LxO2;->a(LzO2;Ljava/util/List;J)LyO2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LaT5;

    check-cast p2, Lkz0;

    invoke-virtual {p2}, Lkz0;->s()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lg10$a;->a(LaT5;J)LyO2;

    move-result-object p1

    return-object p1
.end method
