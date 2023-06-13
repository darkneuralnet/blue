.class public final synthetic LxY0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBX5$a;


# instance fields
.field public final synthetic a:LzY0;

.field public final synthetic b:LT96;

.field public final synthetic c:LJg1;


# direct methods
.method public synthetic constructor <init>(LzY0;LT96;LJg1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LxY0;->a:LzY0;

    iput-object p2, p0, LxY0;->b:LT96;

    iput-object p3, p0, LxY0;->c:LJg1;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LxY0;->a:LzY0;

    iget-object v1, p0, LxY0;->b:LT96;

    iget-object v2, p0, LxY0;->c:LJg1;

    invoke-static {v0, v1, v2}, LzY0;->c(LzY0;LT96;LJg1;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
