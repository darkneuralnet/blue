.class public final synthetic Lml9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lmm9;

.field public final synthetic c:Lxk9;

.field public final synthetic d:Le49;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lmm9;Lxk9;Le49;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lml9;->b:Lmm9;

    iput-object p2, p0, Lml9;->c:Lxk9;

    iput-object p3, p0, Lml9;->d:Le49;

    iput-object p4, p0, Lml9;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lml9;->b:Lmm9;

    iget-object v1, p0, Lml9;->c:Lxk9;

    iget-object v2, p0, Lml9;->d:Le49;

    iget-object v3, p0, Lml9;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lmm9;->c(Lxk9;Le49;Ljava/lang/String;)V

    return-void
.end method
