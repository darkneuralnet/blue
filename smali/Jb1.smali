.class public final synthetic LJb1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LOb1;

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(LOb1;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJb1;->b:LOb1;

    iput-wide p2, p0, LJb1;->c:J

    iput-wide p4, p0, LJb1;->d:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, LJb1;->b:LOb1;

    iget-wide v1, p0, LJb1;->c:J

    iget-wide v3, p0, LJb1;->d:J

    invoke-static {v0, v1, v2, v3, v4}, LOb1;->g(LOb1;JJ)V

    return-void
.end method
