.class public final LdT0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXU2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LdT0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Model:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LXU2<",
        "TModel;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LdT0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LdT0$a<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LdT0$c$a;

    invoke-direct {v0, p0}, LdT0$c$a;-><init>(LdT0$c;)V

    iput-object v0, p0, LdT0$c;->a:LdT0$a;

    return-void
.end method


# virtual methods
.method public b(LQW2;)LWU2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQW2;",
            ")",
            "LWU2<",
            "TModel;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance p1, LdT0;

    iget-object v0, p0, LdT0$c;->a:LdT0$a;

    invoke-direct {p1, v0}, LdT0;-><init>(LdT0$a;)V

    return-object p1
.end method
