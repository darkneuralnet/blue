.class public final LKH7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LuT8;


# instance fields
.field public final synthetic a:LCI7;


# direct methods
.method public constructor <init>(LCI7;)V
    .locals 0

    iput-object p1, p0, LKH7;->a:LCI7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/net/URLConnection;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LKH7;->a:LCI7;

    invoke-static {v0}, LCI7;->c(LCI7;)Ljava/net/HttpURLConnection;

    move-result-object v0

    return-object v0
.end method
