.class public final LJL8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroid/content/ComponentName;

.field public final synthetic c:LEM8;


# direct methods
.method public constructor <init>(LEM8;Landroid/content/ComponentName;)V
    .locals 0

    iput-object p1, p0, LJL8;->c:LEM8;

    iput-object p2, p0, LJL8;->b:Landroid/content/ComponentName;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LJL8;->c:LEM8;

    iget-object v0, v0, LEM8;->d:LQM8;

    iget-object v1, p0, LJL8;->b:Landroid/content/ComponentName;

    invoke-static {v0, v1}, LQM8;->M(LQM8;Landroid/content/ComponentName;)V

    return-void
.end method
