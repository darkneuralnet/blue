.class public final LGm5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrj1<",
        "Lym5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbl0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lbl0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGm5;->a:LY94;

    return-void
.end method

.method public static a(Lbl0;)Lym5;
    .locals 1

    invoke-static {p0}, LFm5;->a(Lbl0;)Lym5;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, LCZ3;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lym5;

    return-object p0
.end method

.method public static b(LY94;)LGm5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lbl0;",
            ">;)",
            "LGm5;"
        }
    .end annotation

    new-instance v0, LGm5;

    invoke-direct {v0, p0}, LGm5;-><init>(LY94;)V

    return-object v0
.end method


# virtual methods
.method public c()Lym5;
    .locals 1

    iget-object v0, p0, LGm5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbl0;

    invoke-static {v0}, LGm5;->a(Lbl0;)Lym5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LGm5;->c()Lym5;

    move-result-object v0

    return-object v0
.end method
