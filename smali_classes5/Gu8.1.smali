.class public final synthetic LGu8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Liw8;


# instance fields
.field public final synthetic a:Lgv8;


# direct methods
.method public synthetic constructor <init>(Lgv8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGu8;->a:Lgv8;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LGu8;->a:Lgv8;

    invoke-virtual {v0}, Lgv8;->c()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
