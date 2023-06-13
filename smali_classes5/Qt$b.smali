.class public final LQt$b;
.super LB73$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:LB73$c;

.field public b:LB73$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LB73$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LB73;
    .locals 4

    new-instance v0, LQt;

    iget-object v1, p0, LQt$b;->a:LB73$c;

    iget-object v2, p0, LQt$b;->b:LB73$b;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LQt;-><init>(LB73$c;LB73$b;LQt$a;)V

    return-object v0
.end method

.method public b(LB73$b;)LB73$a;
    .locals 0

    iput-object p1, p0, LQt$b;->b:LB73$b;

    return-object p0
.end method

.method public c(LB73$c;)LB73$a;
    .locals 0

    iput-object p1, p0, LQt$b;->a:LB73$c;

    return-object p0
.end method
