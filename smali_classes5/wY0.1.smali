.class public final synthetic LwY0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LzY0;

.field public final synthetic c:LT96;

.field public final synthetic d:Lla6;

.field public final synthetic e:LJg1;


# direct methods
.method public synthetic constructor <init>(LzY0;LT96;Lla6;LJg1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LwY0;->b:LzY0;

    iput-object p2, p0, LwY0;->c:LT96;

    iput-object p3, p0, LwY0;->d:Lla6;

    iput-object p4, p0, LwY0;->e:LJg1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LwY0;->b:LzY0;

    iget-object v1, p0, LwY0;->c:LT96;

    iget-object v2, p0, LwY0;->d:Lla6;

    iget-object v3, p0, LwY0;->e:LJg1;

    invoke-static {v0, v1, v2, v3}, LzY0;->b(LzY0;LT96;Lla6;LJg1;)V

    return-void
.end method
