.class public final synthetic LUl9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lmm9;

.field public final synthetic c:Le49;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:J

.field public final synthetic f:Lvd9;


# direct methods
.method public synthetic constructor <init>(Lmm9;Le49;Ljava/lang/Object;JLvd9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUl9;->b:Lmm9;

    iput-object p2, p0, LUl9;->c:Le49;

    iput-object p3, p0, LUl9;->d:Ljava/lang/Object;

    iput-wide p4, p0, LUl9;->e:J

    iput-object p6, p0, LUl9;->f:Lvd9;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, LUl9;->b:Lmm9;

    iget-object v1, p0, LUl9;->c:Le49;

    iget-object v2, p0, LUl9;->d:Ljava/lang/Object;

    iget-wide v3, p0, LUl9;->e:J

    iget-object v5, p0, LUl9;->f:Lvd9;

    invoke-virtual/range {v0 .. v5}, Lmm9;->h(Le49;Ljava/lang/Object;JLvd9;)V

    return-void
.end method
