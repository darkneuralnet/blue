.class public final LtP8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:J

.field public final synthetic c:LcR8;


# direct methods
.method public constructor <init>(LcR8;J)V
    .locals 0

    iput-object p1, p0, LtP8;->c:LcR8;

    iput-wide p2, p0, LtP8;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LtP8;->c:LcR8;

    iget-wide v1, p0, LtP8;->b:J

    invoke-static {v0, v1, v2}, LcR8;->o(LcR8;J)V

    return-void
.end method
