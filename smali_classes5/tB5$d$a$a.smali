.class public LtB5$d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LtB5$d$a;->b(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:LtB5$d$a;


# direct methods
.method public constructor <init>(LtB5$d$a;Z)V
    .locals 0

    iput-object p1, p0, LtB5$d$a$a;->c:LtB5$d$a;

    iput-boolean p2, p0, LtB5$d$a$a;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LtB5$d$a$a;->c:LtB5$d$a;

    iget-boolean v1, p0, LtB5$d$a$a;->b:Z

    invoke-virtual {v0, v1}, LtB5$d$a;->a(Z)V

    return-void
.end method
