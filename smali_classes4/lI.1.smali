.class public final synthetic LlI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LXn1$a;

.field public final synthetic c:Ljava/io/InputStream;

.field public final synthetic d:LOI;

.field public final synthetic e:Lco/bird/android/model/persistence/Bird;

.field public final synthetic f:Lco/bird/android/model/persistence/VehicleVersion;

.field public final synthetic g:Ljava/lang/Long;


# direct methods
.method public synthetic constructor <init>(LXn1$a;Ljava/io/InputStream;LOI;Lco/bird/android/model/persistence/Bird;Lco/bird/android/model/persistence/VehicleVersion;Ljava/lang/Long;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LlI;->b:LXn1$a;

    iput-object p2, p0, LlI;->c:Ljava/io/InputStream;

    iput-object p3, p0, LlI;->d:LOI;

    iput-object p4, p0, LlI;->e:Lco/bird/android/model/persistence/Bird;

    iput-object p5, p0, LlI;->f:Lco/bird/android/model/persistence/VehicleVersion;

    iput-object p6, p0, LlI;->g:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LlI;->b:LXn1$a;

    iget-object v1, p0, LlI;->c:Ljava/io/InputStream;

    iget-object v2, p0, LlI;->d:LOI;

    iget-object v3, p0, LlI;->e:Lco/bird/android/model/persistence/Bird;

    iget-object v4, p0, LlI;->f:Lco/bird/android/model/persistence/VehicleVersion;

    iget-object v5, p0, LlI;->g:Ljava/lang/Long;

    invoke-static/range {v0 .. v5}, LOI;->K(LXn1$a;Ljava/io/InputStream;LOI;Lco/bird/android/model/persistence/Bird;Lco/bird/android/model/persistence/VehicleVersion;Ljava/lang/Long;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
