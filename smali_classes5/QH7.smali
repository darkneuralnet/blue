.class public final LQH7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZG7;


# instance fields
.field public final a:Lam8;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lam8;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQH7;->a:Lam8;

    iput-object p2, p0, LQH7;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(LXs7;)Lam8;
    .locals 2

    iget-object v0, p0, LQH7;->a:Lam8;

    iget-object v1, p0, LQH7;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lam8;->e(Ljava/lang/String;LXs7;)V

    iget-object p1, p0, LQH7;->a:Lam8;

    return-object p1
.end method
