.class public final synthetic LSW8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LGX8;

.field public final synthetic c:LIH8;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:LkY8;


# direct methods
.method public synthetic constructor <init>(LGX8;LkY8;LIH8;Ljava/lang/String;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSW8;->b:LGX8;

    iput-object p2, p0, LSW8;->e:LkY8;

    iput-object p3, p0, LSW8;->c:LIH8;

    iput-object p4, p0, LSW8;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LSW8;->b:LGX8;

    iget-object v1, p0, LSW8;->e:LkY8;

    iget-object v2, p0, LSW8;->c:LIH8;

    iget-object v3, p0, LSW8;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, LGX8;->b(LkY8;LIH8;Ljava/lang/String;)V

    return-void
.end method
