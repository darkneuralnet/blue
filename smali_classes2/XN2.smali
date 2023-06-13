.class public final synthetic LXN2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/savedstate/a$c;


# instance fields
.field public final synthetic a:LaO2;

.field public final synthetic b:LPr6;

.field public final synthetic c:LIP5;

.field public final synthetic d:Ljava/lang/Class;

.field public final synthetic e:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(LaO2;LPr6;LIP5;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXN2;->a:LaO2;

    iput-object p2, p0, LXN2;->b:LPr6;

    iput-object p3, p0, LXN2;->c:LIP5;

    iput-object p4, p0, LXN2;->d:Ljava/lang/Class;

    iput-object p5, p0, LXN2;->e:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 5

    iget-object v0, p0, LXN2;->a:LaO2;

    iget-object v1, p0, LXN2;->b:LPr6;

    iget-object v2, p0, LXN2;->c:LIP5;

    iget-object v3, p0, LXN2;->d:Ljava/lang/Class;

    iget-object v4, p0, LXN2;->e:Ljava/lang/Class;

    invoke-static {v0, v1, v2, v3, v4}, LYN2;->a(LaO2;LPr6;LIP5;Ljava/lang/Class;Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
