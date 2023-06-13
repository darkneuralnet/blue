.class public final synthetic LKb1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LOb1;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(LOb1;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKb1;->b:LOb1;

    iput-wide p2, p0, LKb1;->c:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LKb1;->b:LOb1;

    iget-wide v1, p0, LKb1;->c:J

    invoke-static {v0, v1, v2}, LOb1;->p(LOb1;J)V

    return-void
.end method
