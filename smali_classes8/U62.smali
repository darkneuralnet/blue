.class public LU62;
.super LV62;
.source "SourceFile"


# instance fields
.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(DDLjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, LV62;-><init>()V

    iput-wide p1, p0, LV62;->a:D

    iput-wide p3, p0, LV62;->b:D

    iput-object p5, p0, LU62;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b(DDLhg2;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, LV62;->a(DD)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LU62;->c:Ljava/lang/Object;

    invoke-interface {p5, p1}, Lhg2;->a(Ljava/lang/Object;)V

    return-void
.end method
