.class public LEE2$a;
.super LGV2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEE2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public c:LVq5;


# direct methods
.method public constructor <init>(LVq5;)V
    .locals 0

    invoke-direct {p0}, LGV2;-><init>()V

    iput-object p1, p0, LEE2$a;->c:LVq5;

    return-void
.end method


# virtual methods
.method public b(LBV2;ILBV2;I)V
    .locals 1

    invoke-virtual {p1}, LBV2;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcr5;

    invoke-virtual {p3}, LBV2;->c()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcr5;

    iget-object v0, p0, LEE2$a;->c:LVq5;

    invoke-interface {v0, p1, p2, p3, p4}, LVq5;->a(Lcr5;ILcr5;I)V

    return-void
.end method
