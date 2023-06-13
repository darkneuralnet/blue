.class public final Lz6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0008\u0001\u0012\u00020\u00010\u0000H\u0007\u00a8\u0006\u0004"
    }
    d2 = {
        "Lkotlin/reflect/KClass;",
        "Landroid/app/Activity;",
        "",
        "a",
        "extension_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lkotlin/reflect/KClass;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/KClass<",
            "+",
            "Landroid/app/Activity;",
            ">;)I"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "This requires the Navigator caller to have knowledge of which Activity the Navigator is starting (which should be left as an implementation detail of the Navigator which could change) and that the Navigator is starting it for result. Manage your own request codes and pass them in to the Navigator functions. This self-documents that the Navigator will start the activity for result, and allows the caller to not have to worry about which Activity the Navigator is using under the hood. (lastly, fwiw, this function has a 1 in 65536 change of collision, which is non-zero)."
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/reflect/jvm/KClassesJvm;->getJvmName(Lkotlin/reflect/KClass;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    const v0, 0xffff

    and-int/2addr p0, v0

    return p0
.end method
