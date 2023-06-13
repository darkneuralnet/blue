.class public final Lak0$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LiV2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lak0$d;->a(LgV2;LEt0;I)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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
.field public final synthetic b:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LEX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lak0$d$a;->b:LEX2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public o0(LpV2;)V
    .locals 2

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lak0$d$a;->b:LEX2;

    invoke-static {}, LZp5;->g()LV94;

    move-result-object v1

    invoke-interface {p1, v1}, LpV2;->a(LhV2;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method
