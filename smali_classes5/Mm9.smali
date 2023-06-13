.class public final synthetic LMm9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Len9;

.field public final synthetic c:LO59;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:J

.field public final synthetic f:Lzt8;


# direct methods
.method public synthetic constructor <init>(Len9;LO59;Ljava/lang/Object;JLzt8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMm9;->b:Len9;

    iput-object p2, p0, LMm9;->c:LO59;

    iput-object p3, p0, LMm9;->d:Ljava/lang/Object;

    iput-wide p4, p0, LMm9;->e:J

    iput-object p6, p0, LMm9;->f:Lzt8;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, LMm9;->b:Len9;

    iget-object v1, p0, LMm9;->c:LO59;

    iget-object v2, p0, LMm9;->d:Ljava/lang/Object;

    iget-wide v3, p0, LMm9;->e:J

    iget-object v5, p0, LMm9;->f:Lzt8;

    invoke-virtual/range {v0 .. v5}, Len9;->h(LO59;Ljava/lang/Object;JLzt8;)V

    return-void
.end method
