.class public final synthetic Lea6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lga6;

.field public final synthetic c:LgB1;

.field public final synthetic d:Lim;


# direct methods
.method public synthetic constructor <init>(Lga6;LgB1;Lim;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lea6;->b:Lga6;

    iput-object p2, p0, Lea6;->c:LgB1;

    iput-object p3, p0, Lea6;->d:Lim;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lea6;->b:Lga6;

    iget-object v1, p0, Lea6;->c:LgB1;

    iget-object v2, p0, Lea6;->d:Lim;

    invoke-static {v0, v1, v2}, Lga6;->a(Lga6;LgB1;Lim;)V

    return-void
.end method
