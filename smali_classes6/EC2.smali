.class public final LEC2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lqy0;

.field public final b:Lke5;

.field public final c:Lei3;

.field public d:LwL3;

.field public e:Lke5$b;

.field public f:Lke5$c;


# direct methods
.method public constructor <init>(Lqy0;LlW2;Lke5;Lei3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LMY1;

    invoke-direct {v0}, LMY1;-><init>()V

    iput-object v0, p0, LEC2;->e:Lke5$b;

    new-instance v0, LA83;

    invoke-direct {v0}, LA83;-><init>()V

    iput-object v0, p0, LEC2;->f:Lke5$c;

    iput-object p1, p0, LEC2;->a:Lqy0;

    iput-object p2, p0, LEC2;->d:LwL3;

    iput-object p3, p0, LEC2;->b:Lke5;

    iput-object p4, p0, LEC2;->c:Lei3;

    return-void
.end method
