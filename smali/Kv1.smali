.class public final synthetic LKv1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LLv1;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(LLv1;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKv1;->b:LLv1;

    iput-wide p2, p0, LKv1;->c:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LKv1;->b:LLv1;

    iget-wide v1, p0, LKv1;->c:J

    invoke-static {v0, v1, v2}, LLv1;->e(LLv1;J)V

    return-void
.end method
