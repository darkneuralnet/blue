.class public final synthetic Lrs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lts;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lts;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrs;->b:Lts;

    iput-boolean p2, p0, Lrs;->c:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lrs;->b:Lts;

    iget-boolean v1, p0, Lrs;->c:Z

    invoke-static {v0, v1}, Lts;->Ql(Lts;Z)V

    return-void
.end method
