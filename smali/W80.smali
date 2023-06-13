.class public final synthetic LW80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc90;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lc90;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW80;->b:Lc90;

    iput-boolean p2, p0, LW80;->c:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LW80;->b:Lc90;

    iget-boolean v1, p0, LW80;->c:Z

    invoke-static {v0, v1}, Lc90;->e(Lc90;Z)V

    return-void
.end method
